package one.digitalinnovation.digiobank

class Pessoa {
    var nome : String = "Thierry"
    var cpf :  String = "123.123.123-12"


}

fun main(){
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}