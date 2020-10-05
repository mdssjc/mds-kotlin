fun main() {
    val letter = readLine()!!
    val letters = mutableMapOf<String, Int>()

    val alphabet = ('a'..'z').toList()
    for (index in alphabet.indices) {
        val l = alphabet[index]
        if ("aeiouy".contains(l.toLowerCase())) {
            letters[l.toString()] = index + 1
        }
    }

    println(letters[letter.toLowerCase()] ?: 0)
}