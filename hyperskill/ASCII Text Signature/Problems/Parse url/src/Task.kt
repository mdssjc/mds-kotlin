import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val url = scanner.nextLine()

    val queryPath = url.substring(url.indexOf("?") + 1)
    val params = queryPath.split("&")

    var result = ""
    for (param in params) {
        val kv = param.split("=")
        val key = kv[0]
        val value = if (kv[1].isBlank()) "not found" else kv[1]

        if (key == "pass") {
            result = "password : $value"
        }

        println("$key : $value")
    }

    print(result)
}