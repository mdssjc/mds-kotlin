package tictactoe

import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    var cells = "_________"

    printCells(cells)

    var player = 1

    do {
        print("Enter the coordinates: ")
        val position = getPosition(scanner.nextInt(), scanner.nextInt())

        when {
            position > 8 -> {
                println("Coordinates should be from 1 to 3!")
            }
            cells[position] != '_' -> {
                println("This cell is occupied! Choose another one!")
            }
            else -> {
                cells = cells.substring(0, position) + (if (player == 1) "X" else "O") + cells.substring(position + 1)
                player = if (player == 1) 2 else 1

                printCells(cells)
                val result = finishGame(cells)

                if (result != "Game not finished") {
                    println(result)
                    break
                }
            }
        }
    } while (true)
}

fun getPosition(row: Int, column: Int) = (row - 1) * 3 + column - 1

fun printCells(cells: String) {
    println("---------")
    for (row in 0..2) {
        val column = row * 3
        println("| ${cells[column]} ${cells[column + 1]} ${cells[column + 2]} |")
    }
    println("---------")
}

fun finishGame(symbols: String): String {
    var winX = 0
    var winO = 0
    val countX = symbols.count { l -> l == 'X' }
    val countO = symbols.count { l -> l == 'O' }
    val complete = symbols.indexOf("_") == -1

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

    return if (winX >= 1 && winO == 0) {
        "X wins"
    } else if (winX == 0 && winO >= 1) {
        "O wins"
    } else if (winX > 0 && winO > 0 || abs(countX - countO) > 1) {
        "Impossible"
    } else if (complete) {
        "Draw"
    } else {
        "Game not finished"
    }
}