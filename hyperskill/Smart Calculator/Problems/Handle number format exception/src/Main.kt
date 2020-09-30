fun parseCardNumber(cardNumber: String): Long {
    val numbers = cardNumber.split(" ")

    if (numbers.all { n -> n.length == 4 }.and(numbers.size == 4)) {
        return cardNumber.replace(" ", "").toLong()
    }

    throw Exception("card number is incorrect")
}