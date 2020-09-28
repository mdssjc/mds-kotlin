package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextLine()

    while (input != "/exit") {
        val inputs = input.split(" ")
        if (inputs.size == 2) {
            val a = inputs[0].toInt()
            val b = inputs[1].toInt()
            println(a + b)
        } else if (input.isNotBlank()) {
            println(input)
        }

        input = scanner.nextLine()
    }

    println("Bye!")
}