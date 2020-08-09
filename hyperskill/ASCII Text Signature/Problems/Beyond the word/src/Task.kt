import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x = input.next()

    for (l in 'a'..'z') {
        if (l in x) {
            continue
        }
        print(l)
    }
}