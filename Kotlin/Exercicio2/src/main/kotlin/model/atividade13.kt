package model

open class atividade13 {
    init {
        println("\n" +
                " Atividade 13 \n Dada uma lista de números, crie uma nova lista apenas com os ímpares")
    }

    open fun listaNumericaImpar(){
        val listaNumerica = (1..100).toList()
        val listaImpar = listaNumerica.filter { numero -> numero %2 ==1 }

        println("$listaImpar \n")
    }

}