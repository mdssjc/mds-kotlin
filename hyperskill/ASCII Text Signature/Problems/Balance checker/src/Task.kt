import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var n = scanner.nextInt()
    var m = 0
    while (scanner.hasNextInt()) {
        m += scanner.nextInt()

        if (n - m >= 0) {
            n -= m
            m = 0
        }
    }

    if (m == 0) {
        println("Thank you for choosing us to manage your account! You have $n money.")
    } else {
        println("Error, insufficient funds for the purchase. You have $n, but you need $m.")
    }
}