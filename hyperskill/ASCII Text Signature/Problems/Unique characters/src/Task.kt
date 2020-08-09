import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.next()

    var total = 0
    var sum = 0

    loop@ for (l in 'a'..'z') {
        sum = 0

        for (x in input) {
            if (x == l) {
                sum++
            }

            if (sum > 1) {
                continue@loop
            }
        }

        if (sum == 1) {
            total++
        }
    }

    println(total)
}