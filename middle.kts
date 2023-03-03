package middle

fun getMiddle(word : String) : String {
    val length = word.length
    val middleIndex = length / 2
    println(length)
    println(middleIndex)
    return if (length % 2 == 0) {
        word.substring(middleIndex - 1, middleIndex + 1)
    } else {
        word.substring(middleIndex, middleIndex + 1)
    }

}
getMiddle("tekstp")
