package model

open class atividade14 {
    init {
        println("\n" +
                " Atividade 14 \n Dada uma lista de preços, calcule o total da compra")
    }

    open fun somaDaCompra(){
        val listaDosPrecosDaCompra = mutableListOf(122,2132,423,23,53,76,32,12)
        var totalCompra = listaDosPrecosDaCompra.sum()

        println("Fiz a compra dos itens com os seguintes valores: $listaDosPrecosDaCompra e o total foi de $totalCompra\n")
    }
}