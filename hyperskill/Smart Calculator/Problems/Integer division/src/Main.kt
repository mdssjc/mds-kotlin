fun intDivision(x: String, y: String): Int {
    try {
        val v1 = x.toInt()
        val v2 = y.toInt()
        return v1 / v2
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    } catch (e: Exception) {
        println("Read values are not integers.")
    }
    return 0
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))
}