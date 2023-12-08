fun main(numbers: Array<String>) {
    print("Введите числа через пробел: ")
    val input = readlnOrNull() ?: ""
    val inputArray = input.split(' ').toTypedArray()
    val uniqueNumbersCount = inputArray.toSet().size
    println(uniqueNumbersCount)
}
