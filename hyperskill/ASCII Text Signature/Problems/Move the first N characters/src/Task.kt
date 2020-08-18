import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val n = scanner.nextInt()

    println(if (n >= s.length || n <= 0) s else s.substring(n) + s.substring(0, n))
}