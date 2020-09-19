package tictactoe

import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter cells: ")
    val cells = scanner.nextLine()

    printCells(cells)

    print("Enter the coordinates: ")
    var row: Int
    var column: Int
    var isErr = false

    do {
        row = scanner.nextInt()
        column = scanner.nextInt()

        isErr = if (row > 3 || column > 3) {
            println("Coordinates should be from 1 to 3!")
            true
        } else if (cells[getPosition(row, column)] != '_') {
            println("This cell is occupied! Choose another one!")
            true
        } else {
            false
        }
    } while (isErr)

    val position = getPosition(row, column)
    printCells(cells.substring(0, position) + "X" + cells.substring(position + 1))
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

fun finishGame(symbols: String) {
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