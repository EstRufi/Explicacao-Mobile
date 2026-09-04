package model

open class atividade12 {
    init {
        println("Atividade 12 \n " +
                " Escreva um programa que conte de 1 a 100 e:\n" +
                "● Se for múltiplo de 3, mostre “Batata”\n" +
                "● Se for múltiplo de 5, mostre “Quente”\n" +
                "● Se for múltiplo de 3 e 5, mostre “BatataQuente”\n")
    }
    open  fun contar (){
        // Não está como queria
        val cont = (1 .. 100).toList()
        var i =1
        while (i<cont.size){
            if (i %3 == 0 && i %5 == 0){
                println("Os multiplos de 3 são: $i é BATATAS\n")
            }
            else if(i %3 == 0 ){
                println("Os multiplos de 5 são: $i é QUENTES\n")
            }
            else if(i %5 == 0){
                println("Os multiplos de 5 e 3 são $i, então são  BATATAS-QUENTES\n")
            }

            i++
        }

    }
}