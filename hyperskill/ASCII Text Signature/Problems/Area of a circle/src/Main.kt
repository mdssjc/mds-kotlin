import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val r = scanner.nextDouble()
    val pi = 3.1415

    val s = pi * r.pow(2)

    println(s)
}