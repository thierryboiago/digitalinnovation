package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Thierry"
        private set
    var cpf: String = "123.123.123-12"
        private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}

fun main() {
    val pessoa = Pessoa()
    println(pessoa.pessoaInfo())
}