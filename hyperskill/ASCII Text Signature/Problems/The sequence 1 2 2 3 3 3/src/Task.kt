import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var i = 1
    var next = i
    var value = i

    while (i <= n) {
        print("$next ")

        if (value == next) {
            value = 0
            next++
        }

        i++
        value++
    }
}