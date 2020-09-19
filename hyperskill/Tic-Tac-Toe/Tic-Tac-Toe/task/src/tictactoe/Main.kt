package tictactoe

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter cells:")
    val symbols = scanner.nextLine()

    println("---------")
    for (i in 0..2) {
        val row = i * 3
        println("| ${symbols[row]} ${symbols[row + 1]} ${symbols[row + 2]} |")
    }
    println("---------")
}