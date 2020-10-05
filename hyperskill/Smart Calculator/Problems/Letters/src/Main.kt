import java.util.*

fun main() {
    val letters = mutableMapOf<Int, String>()

    val scanner = Scanner(System.`in`)
    var input = scanner.next()
    var i = 1
    while (input != "z") {
        letters[i] = input

        i++
        input = scanner.next()
    }

    print(letters[4])
}
