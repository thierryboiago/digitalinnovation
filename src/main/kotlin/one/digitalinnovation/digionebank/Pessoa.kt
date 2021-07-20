package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Thierry"

    var cpf: String = "123.123.123-12"
    private set

    inner class Endereco {
        var rua: String = "Rua teste"

    }


}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)
}