import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()

    println(if (text == text.reversed()) "yes" else "no")
}