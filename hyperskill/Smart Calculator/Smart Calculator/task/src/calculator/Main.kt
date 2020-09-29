package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextLine()

    while (input != "/exit") {
        val inputs = input.split(" ")
        if (input == "/help") {
            println("The program calculates the sum of numbers")
        } else if (inputs.size > 1) {
            val result = inputs.map { a -> a.toInt() }.sum()
            println(result)
        } else if (input.isNotBlank()) {
            println(input)
        }

        input = scanner.nextLine()
    }

    println("Bye!")
}