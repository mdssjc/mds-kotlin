import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()

    println(text.indexOf("the", 0, true))
}