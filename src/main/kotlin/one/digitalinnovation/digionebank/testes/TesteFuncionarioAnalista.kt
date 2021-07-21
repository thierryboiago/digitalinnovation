package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {


    val analista  = Analista(nome = "Thierry", cpf = "123.123.123-12",salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(analista)
}