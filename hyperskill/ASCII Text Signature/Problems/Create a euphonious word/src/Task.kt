import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')

    var countVowels = 0
    var countConsonants = 0
    var total = 0

    for (w in word) {
        if (w in vowels) {
            countVowels++
            countConsonants = 0
            if (countVowels == 3) {
                total++
                countVowels = 1
            }
        } else {
            countVowels = 0
            countConsonants++
            if (countConsonants == 3) {
                total++
                countConsonants = 1
            }
        }
    }

    println(total)
}