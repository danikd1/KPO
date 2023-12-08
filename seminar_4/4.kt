fun main() {
    val n = readln().toInt()
    val matrix = Array(n) { Array(n) { (0..10).random() } }

    // Вывод матрицы
    for (line in matrix) {
        for (num in line) {
            print("$num  ")
        }
        println()
    }

    var sum = 0
    // Сумма чисел под побочной диагональю
    for (i in 0..<n) {
        for (j in 0..<n) {
            if (j > n - i - 1) {
                sum += matrix[i][j]
            }
        }
    }
    println("Сумма чисел под побочной диагональю: $sum")
}
