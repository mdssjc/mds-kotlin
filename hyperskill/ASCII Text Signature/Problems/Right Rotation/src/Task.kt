import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()

    val a = IntArray(size)
    for (i in 0..a.lastIndex) {
        a[i] = scanner.nextInt()
    }

    val shift = scanner.nextInt() % size
    for (i in 0..a.lastIndex) {
        print(a[(size - shift + i) % size].toString() + " ")
    }
}