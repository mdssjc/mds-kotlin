package signature

fun main() {
    println(" _____________")
    println("| Hyper Skill |")
    println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯")

    print("Enter name and surname: ")
    val name = readLine()!!

    print("Enter person's status: ")
    val status = readLine()!!

    if (name != null && name.length > 2) {
        val name = name.split(" ")
        printName(name[0], name[1])
    }

    val topLetters = arrayOf("____", "___ ", "____", "___ ", "____", "____", "____", "_  _", "_", " _", "_  _", "_   ", "_  _", "_  _", "____", "___ ", "____", "____", "____", "___", "_  _", "_  _", "_ _ _", "_  _", "_   _", "___ ", "    ")
    val middleLetters = arrayOf("|__|", "|__]", "|   ", "|  \\", "|___", "|___", "| __", "|__|", "|", " |", "|_/ ", "|   ", "|\\/|", "|\\ |", "|  |", "|__]", "|  |", "|__/", "[__ ", " | ", "|  |", "|  |", "| | |", " \\/ ", " \\_/ ", "  / ", "    ")
    val bottomLetters = arrayOf("|  |", "|__]", "|___", "|__/", "|___", "|   ", "|__]", "|  |", "|", "_|", "| \\_", "|___", "|  |", "| \\|", "|__|", "|   ", "|_\\|", "|  \\", "___]", " | ", "|__|", " \\/ ", "|_|_|", "_/\\_", "  |  ", " /__", "    ")

    var top = " "
    var middle = " "
    var bottom = " "
    for (n in name) {
        var i = n.toLowerCase().toInt() - 97
        if (n == ' ') {
            i = 26
        }
        top += topLetters[i] + " "
        middle += middleLetters[i] + " "
        bottom += bottomLetters[i] + " "
    }

    printSymbol(top.length + 2)
    println("*$top*")
    println("*$middle*")
    println("*$bottom*")
    print("*")
    print(" ".repeat((top.length - status.length) / 2))
    print(status)
    print(" ".repeat((top.length - status.length) / 2))
    println("*")
    printSymbol(top.length + 2)
}

fun printName(firstName: String, lastName: String) {
    val size = firstName.length + lastName.length + 5
    printSymbol(size)
    println("* $firstName $lastName *")
    printSymbol(size)
}

fun printSymbol(size: Int) {
    repeat(size) {
        print("*")
    }
    println()
}
