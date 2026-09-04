package model

import kotlin.math.sign

open class atividade15 {
    init {
        println("\n" +
                " Atividade 15 \n ada uma lista de idades, calcule a média dos maiores de idade")
    }

    open fun listaDeMaioresDeIdade(){
        val listaIdades = mutableListOf(12,54,67,32,11,33,12,33,12,43,75,11,1,2,3,4,2,3,4,6)
        var maiorIdade = listaIdades.filter { numero -> numero > 18 }
        var mediaIdade = (maiorIdade.sum())/ maiorIdade.size


        println("As idades cadastradas são $listaIdades. \n Os maiores de idade são $maiorIdade.\n Então a média é de $mediaIdade")
    }

}