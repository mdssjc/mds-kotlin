package signature

fun main() {
    print("Enter name and surname: ")
    val name = readLine()!!.trim()

    print("Enter person's status: ")
    val status = readLine()!!.trim()

    printSignature(name, status)
}

fun printSignature(name: String, status: String) {
    val line = List(3) { mutableListOf<CharSequence>() }

    for (ch in name.toUpperCase()) {
        if (ch == ' ') line.forEach { it -> it.add(Font.space) } else
            Font.valueOf(ch.toString()).run { line.forEachIndexed { i, ln -> ln.add(fontASCII[i]) } }
    }
    val print = Array(3) { i -> line[i].joinToString(" ") }

    val asteriskLine = {
        println("*".repeat(maxOf(print[0].length, status.length)
                + Font.indent * 2 + 2))
    }

    fun statusIndent(right: Boolean = false): String {
        val indentation = maxOf(print[0].length - status.length + Font.indent * 2, Font.indent * 2)
        return " ".repeat(indentation / 2 + if (right) indentation % 2 else 0)
    }

    fun fontIndent(right: Boolean = false): String {
        val indentation = status.length - print[0].length
        return " ".repeat(maxOf(Font.indent, indentation / 2 + Font.indent + if (right) indentation % 2 else 0))
    }

    asteriskLine()
    print.forEach { println("*${fontIndent()}$it${fontIndent(true)}*") }
    println("*${statusIndent()}$status${statusIndent(true)}*")
    asteriskLine()
}

enum class Font(val fontASCII: List<CharSequence>) {
    A(listOf("____", "|__|", "|  |")),
    B(listOf("___ ", "|__]", "|__]")),
    C(listOf("____", "|   ", "|___")),
    D(listOf("___ ", "|  \\", "|__/")),
    E(listOf("____", "|___", "|___")),
    F(listOf("____", "|___", "|   ")),
    G(listOf("____", "| __", "|__]")),
    H(listOf("_  _", "|__|", "|  |")),
    I(listOf("_", "|", "|")),
    J(listOf(" _", " |", "_|")),
    K(listOf("_  _", "|_/ ", "| \\_")),
    L(listOf("_   ", "|   ", "|___")),
    M(listOf("_  _", "|\\/|", "|  |")),
    N(listOf("_  _", "|\\ |", "| \\|")),
    O(listOf("____", "|  |", "|__|")),
    P(listOf("___ ", "|__]", "|   ")),
    Q(listOf("____", "|  |", "|_\\|")),
    R(listOf("____", "|__/", "|  \\")),
    S(listOf("____", "[__ ", "___]")),
    T(listOf("___", " | ", " | ")),
    U(listOf("_  _", "|  |", "|__|")),
    V(listOf("_  _", "|  |", " \\/ ")),
    W(listOf("_ _ _", "| | |", "|_|_|")),
    X(listOf("_  _", " \\/ ", "_/\\_")),
    Y(listOf("_   _", " \\_/ ", "  |  ")),
    Z(listOf("___ ", "  / ", " /__"));

    companion object {
        val space = " ".repeat(4)
        val indent = 2
    }
}
