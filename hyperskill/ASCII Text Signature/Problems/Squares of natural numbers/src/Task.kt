import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var i = 1
    while (i * i <= n) {
        println(i * i)
        i++
    }
}