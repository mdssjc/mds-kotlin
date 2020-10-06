fun main() {
    val words = mutableMapOf<String, Int>()

    do {
        val input = readLine()!!
        if (input != "stop") {
            words[input] = words.getOrDefault(input, 0) + 1
        }
    } while (input != "stop")

    var word: String? = null
    var max = -1
    for ((key, value) in words) {
        if (value > max) {
            word = key
            max = value
        }
    }

    print(word)
}