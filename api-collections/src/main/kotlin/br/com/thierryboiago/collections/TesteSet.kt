package br.com.thierryboiago.collections

fun main() {
    val funcionario1 = Funcionario("Joao", 2000.0,"CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0,"PJ")
    val funcionario3 = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios1 = setOf(funcionario1,funcionario2)
    val funcionarios2 = setOf(funcionario3)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("----------------")
    val funcionarios3 = setOf(funcionario1,funcionario2,funcionario3)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }


    println("----------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}