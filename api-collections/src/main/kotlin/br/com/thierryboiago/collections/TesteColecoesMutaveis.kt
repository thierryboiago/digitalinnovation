package br.com.thierryboiago.collections

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0,"CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0,"PJ")
    val funcionario3 = Funcionario("Maria", 4000.0,"CLT")



    println("------- List -------")
    val funcionarios = mutableListOf(funcionario1,funcionario2)
    funcionarios.forEach{ println(it) }


    println("--------------")
    funcionarios.add(funcionario3)
    funcionarios.forEach{ println(it) }


    println("--------------")
    funcionarios.remove(funcionario1)
    funcionarios.forEach{ println(it) }


    println("------- SET -------")
    val funcionariosSet = mutableSetOf(funcionario1)
    funcionariosSet.forEach{ println(it) }

    println("--------------")
    funcionariosSet.add(funcionario2)
    funcionariosSet.add(funcionario3)
    funcionariosSet.forEach{ println(it) }


    println("--------------")
    funcionariosSet.remove(funcionario3)
    funcionariosSet.forEach{ println(it) }


}