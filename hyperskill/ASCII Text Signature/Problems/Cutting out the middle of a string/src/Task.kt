import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()

    val isEven = line.length % 2 == 0
    val offset = if (isEven) 1 else 0
    val middle = line.length / 2 - offset

    for (i in line.indices) {
        if (i != middle && i != middle + offset) {
            print(line[i])
        }
    }
}