import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ticket = scanner.next()

    var f3 = 0
    var s3 = 0
    for (i in 0..2) {
        f3 += ticket[i].toInt()
        s3 += ticket[i + 3].toInt()
    }

    println(if (f3 == s3) "Lucky" else "Regular")
}