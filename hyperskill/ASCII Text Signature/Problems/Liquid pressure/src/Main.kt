import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val gravity = 9.8
    val density = scanner.nextDouble()
    val height = scanner.nextDouble()

    val liquidPressure = density * gravity * height

    println(liquidPressure)
}