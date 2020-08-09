import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.next()

    for (l in input) {
        if (l.isDigit()) {
            println(l)
            break
        }
    }
}