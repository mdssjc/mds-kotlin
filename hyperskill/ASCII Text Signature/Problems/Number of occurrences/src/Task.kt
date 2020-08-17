import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val target = scanner.next()

    var frequency = 0
    var index = 0

    while (index < text.length) {
        index = text.indexOf(target, index)
        if (index == -1) {
            break
        }
        index++
        frequency++
    }

    println(frequency)
}