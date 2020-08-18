import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val date = scanner.nextLine()
    val dates = date.split("-")

    println(dates[1] + "/" + dates[2] + "/" + dates[0])
}