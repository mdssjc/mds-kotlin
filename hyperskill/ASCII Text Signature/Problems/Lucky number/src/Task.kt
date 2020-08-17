import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ticket = scanner.next()

    val digits = ticket.length / 2

    var first = 0
    var second = 0
    for (i in 0 until digits) {
        first += ticket[i].toInt()
        second += ticket[i + digits].toInt()
    }

    println(if (first == second) "YES" else "NO")
}