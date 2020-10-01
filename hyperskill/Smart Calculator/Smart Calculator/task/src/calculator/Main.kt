package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    do {
        val input = scanner.nextLine()

        if (input.startsWith("/")) {
            println(
                when (input) {
                    "/help" -> "The program calculates the addition + and subtraction - operators"
                    "/exit" -> "Bye!"
                    else -> "Unknown command"
                }
            )
        } else {
            val inputs = input.split(" ")

            try {
                if (inputs.size > 1) {
                    println(calc(inputs))
                } else if (input.isNotBlank()) {
                    println(input.toInt())
                }
            } catch (e: Exception) {
                println("Invalid expression")
            }
        }

    } while (input != "/exit")
}

fun calc(inputs: List<String>): Int {
    var total = inputs[0].toInt()
    var operator = ""

    for (index in (1 until inputs.size)) {
        val value = inputs[index]

        if (value.contains("+")) {
            operator = "+"
        } else if (value.contains("-")) {
            operator = if (value.length % 2 == 0) "+" else "-"
        } else {
            if (operator == "+") {
                total += value.toInt()
            } else {
                total -= value.toInt()
            }
        }
    }

    return total
}
