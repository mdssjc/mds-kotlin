import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var pos = 1

    var i = 1
    while (scanner.hasNextInt()) {
        val n = scanner.nextInt()

        if (n > max) {
            max = n
            pos = i
        }
        i++
    }

    println("$max $pos")
}