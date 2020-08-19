import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    val n = scanner.nextInt()

    var password = ""
    var last = ' '
    while (password.length < n) {
        val temp = when ((0..3).random()) {
            0 -> ('A'..'Z').random()
            1 -> ('a'..'z').random()
            else -> ('0'..'9').random()
        }

        val allOk = a == 0 && b == 0 && c == 0

        val isUpper = temp.isUpperCase() && a == 0 && !allOk
        val isLower = temp.isLowerCase() && b == 0 && !allOk
        val isDigit = temp.isDigit() && c == 0 && !allOk

        if (temp == last || isUpper || isLower || isDigit) {
            continue
        }

        if (temp.isUpperCase()) {
            a--
        }
        if (temp.isLowerCase()) {
            b--
        }
        if (temp.isDigit()) {
            c--
        }

        password += temp
        last = temp
    }

    println(password)
}