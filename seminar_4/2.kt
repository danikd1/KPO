fun main() {
    print("Введите строку: ")
    val userInput = readlnOrNull() ?: ""

    println(userInput)

    val lastWord = userInput.split(" ").last()
    repeat(3) {
        println(lastWord)
    }
}
