import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sequence = 0

    var n: Int
    do {
        n = scanner.nextInt()
        if (n != 0) {
            sequence++
        }
    } while (n != 0)

    println(sequence)
}