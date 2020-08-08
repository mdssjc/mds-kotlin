import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    while (n != 1) {
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
    }
    print(n)
}