import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()

    var last = word[0]
    for (w in word.substring(1)) {
        if (w == last + 1) {
            last = w
        } else {
            println("false")
            return
        }
    }

    println("true")
}