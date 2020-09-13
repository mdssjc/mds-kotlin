import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()

    val result = x.pow(3.0) + x.pow(2.0) + x + 1

    println(result)
}