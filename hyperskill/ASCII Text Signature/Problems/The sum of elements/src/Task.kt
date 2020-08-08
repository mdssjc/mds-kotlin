import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var sum = 0
    var n = scanner.nextInt()

    while (n != 0) {
        sum += n
        n = scanner.nextInt()
    }

    println(sum)
}