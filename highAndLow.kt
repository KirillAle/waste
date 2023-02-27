fun highAndLow(numbers: String): String {
    val splitNumbers = numbers.split(" ")
    println(splitNumbers)
    val intNumbers = splitNumbers.map { it.toInt() }
    println(intNumbers)
    return "${intNumbers.maxOrNull()} ${intNumbers.minOrNull()}"
}

highAndLow("1 9 3 4 -5")