package br.com.thierryboiago.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }

    println("------------------------")
    values.forEach { valor ->//subistitui it para a variavel valor
        println(valor)
    }

    println("------------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("------------------------")
    values.sort()//orderna o array
    for (valor in values) {
        println(valor)
    }
}