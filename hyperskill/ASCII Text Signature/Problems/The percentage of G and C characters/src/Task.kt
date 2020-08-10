import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sequence = scanner.next()

    var i = 0
    val j = sequence.length

    for (s in sequence) {
        if (s.toLowerCase() == 'g' || s.toLowerCase() == 'c') {
            i++
        }
    }

    println(i.toDouble() / j * 100)
}