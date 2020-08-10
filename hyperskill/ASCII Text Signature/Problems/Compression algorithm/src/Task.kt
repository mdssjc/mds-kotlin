import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sequence = scanner.next()

    var count = 0
    var last = sequence[0]
    for (s in sequence) {
        if (s == last) {
            count++
            continue
        }
        print("$last$count")
        last = s
        count = 1
    }
    print("$last$count")
}