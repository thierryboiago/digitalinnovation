package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val gerente = Gerente(nome = "Maria do Carmo", cpf = "123.123.123-12", salario = 5000.00)
    ImprimeRelatorioFuncionario.imprime(gerente)
}
