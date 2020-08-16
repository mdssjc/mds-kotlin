import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()

    val words = text.split(" ").toTypedArray()

    var word = ""
    for (w in words) {
        if (w.length > word.length) {
            word = w
        }
    }

    println(word)
}