package br.com.thierryboiago.collections

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0,"CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0,"PJ")
    val funcionario3 = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = listOf(funcionario1,funcionario2,funcionario3)

    funcionarios.forEach{ println(it) }


    println("********************")
    println(funcionarios.find { it.nome == "Maria" })



    println("********************")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }


    println("********************")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }




}


