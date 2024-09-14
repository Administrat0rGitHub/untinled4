
fun main() {
    println("Введите два числа и операцию (К примеру: 2.0 1.0 -)")

    val input = readlnOrNull()
    if (!input.isNullOrBlank()) {
        val parts = input.split(" ")
        if (parts.size == 3) {
            val number1 = parts[0].toDoubleOrNull()
            val number2 = parts[1].toDoubleOrNull()
            val operations = parts[2]
            if (number1 != null && number2 != null) {
                var result: Double?= null
                when (operations) {
                    "+" -> result = number1 + number2
                    "-" -> result = number1 - number2
                    "*" -> result = number1 * number2
                    "/" -> if (number2 != 0.0) result = number1 / number2
                    else println("Ошибка!: Деление на ноль")
                    else -> println("Ошибка!: Неверная операция")
                }
                if (result != null) {
                    println("Результат: $result")
                }
            } else {
                println("Ошибка!: Введите корректные числа.")
            }
        } else {
            println("Ошибка: Введите два числа и операцию.")
        }
    } else {
        println("Ошибка!: Вы ничего не ввели .")
    }
}