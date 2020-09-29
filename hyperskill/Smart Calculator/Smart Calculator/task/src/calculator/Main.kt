package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextLine()

    while (input != "/exit") {
        val inputs = input.split(" ")
        if (input == "/help") {
            println("The program calculates the addition + and subtraction - operators")
        } else if (inputs.size > 1) {
            println(calc(inputs))
        } else if (input.isNotBlank()) {
            println(input)
        }

        input = scanner.nextLine()
    }

    println("Bye!")
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
