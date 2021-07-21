package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val cliente = Cliente(
        nome = "Jose da Silva",
        cpf = "321.321.232-12",
        clienteTipo = ClienteTipo.PF,
        senha = "1234562"
    )

    println(cliente)

    TesteAutenticacao().autentica(cliente)
}