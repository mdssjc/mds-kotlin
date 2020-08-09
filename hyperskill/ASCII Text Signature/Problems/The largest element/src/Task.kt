import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var max = 0
    do {
        val n = scanner.nextInt()
        if (n > max) {
            max = n
        }
    } while (n != 0)

    println(max)
}