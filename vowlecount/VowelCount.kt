fun getCount(str: String): Int {
    val vowels = "aeiou"
    var vowelsCount = 0
    for (let in str) {
        if (vowels.contains(let)) {
            vowelsCount += 1
        }
    }
    return vowelsCount
}

getCount("abracadabra")