package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcelo"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val marcelo = Pessoa()

    println(marcelo.nome)
    println(marcelo.cpf)
}