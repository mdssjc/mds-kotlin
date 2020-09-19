package tictactoe

import java.util.*
import kotlin.math.abs

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

    var winX = 0
    var winO = 0
    var countX = symbols.count { l -> l == 'X' }
    var countO = symbols.count { l -> l == 'O' }
    var complete = symbols.indexOf("_") == -1

    for (i in 0..2) {
        val row = i * 3
        val valueRow = symbols.subSequence(row, row + 3)
        val valueColumn = "${symbols[i]}${symbols[i + 3]}${symbols[i + 6]}"

        if (valueRow == "XXX" || valueColumn == "XXX") {
            winX++
        } else if (valueRow == "OOO" || valueColumn == "OOO") {
            winO++
        }
    }

    val diagonal1 = "${symbols[0]}${symbols[4]}${symbols[8]}"
    val diagonal2 = "${symbols[2]}${symbols[4]}${symbols[6]}"

    if (diagonal1 == "XXX" || diagonal2 == "XXX") {
        winX++
    } else if (diagonal1 == "OOO" || diagonal2 == "OOO") {
        winO++
    }

    if (winX == 1 && winO == 0) {
        println("X wins")
    } else if (winX == 0 && winO == 1) {
        println("O wins")
    } else if (winX > 0 && winO > 0 || abs(countX - countO) > 1) {
        println("Impossible")
    } else if (complete) {
        println("Draw")
    } else {
        println("Game not finished")
    }
}
