fun highAndLow(numbers: String): String {
    val splitNumbers = numbers.split(" ")
    val intNumbers = splitNumbers.map { it.toInt() }
    return "${intNumbers.maxOrNull()} ${intNumbers.minOrNull()}"
}

highAndLow("1 9 3 4 -5")