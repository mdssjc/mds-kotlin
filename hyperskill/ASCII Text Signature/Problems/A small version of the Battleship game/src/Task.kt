import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val fields = intArrayOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    while (input.hasNextInt()) {
        val x = input.nextInt()
        val y = input.nextInt()

        fields[x - 1] = -1
        fields[y + 5 - 1] = -1
    }

    var ispace = false
    for (i in fields.indices) {
        if (i == 5) {
            ispace = false
            print("\n")
        }

        if (fields[i] == -1) {
            continue
        }

        print(if (ispace) " " else "")
        print(fields[i])
        ispace = true
    }
}
