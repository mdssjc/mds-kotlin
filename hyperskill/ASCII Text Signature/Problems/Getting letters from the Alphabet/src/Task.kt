import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val letter = input.next()[0]
    for (l in 'a'..letter) {
        if (l == letter) {
            break
        }
        print("$l")
    }
}