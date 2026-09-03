package model
// seguimos o mesmo padrão do java que é criando um model
// PARA CRIAR uma classe no kotlin é usando "class" e a palavra da frente a letra deve ser maiuscula {class Carro}
            // Quando o valor não está pré-definido vc é obrigado a colocar,se tiver ja um valor padrão vc pode deixar de colocar

// Para uma classe fazer uma herança devemos colocar "open" na frente da classe
open class Carro {
    // Para dar atributos a sua casse é só vc usar o var

    var modelo:String = ""
        // Esse get é pegar
        get() {
            return field.uppercase()
        }
    var ano:Int = 0
        // set é definir
        set(value) {
            field = if (value >= 0) value else 0
        }

    var portas: Int = 4

    // para deixar uma variavel privada é so colocar "private". Sem ele, automáticamente é public
    private var kilometragem: Double = 0.0
    // fora daqui ele nem aparece
    // e para utilizar ele é so dentro de uma fun

    fun rodar(km:Double){
        kilometragem += km
    }

    fun consultarKm(): Double{
        return kilometragem
    }

    // o init roda sempre que a classe é inicializada. Em outras palavras é a primeira coisa que aparece quando a classe é chamada
    init {
        println("Carro do modelo $modelo foi criado")
    }

    // se eu quiser sobreescrever essa função, eu tbm preciso permitir isso
    open fun acelerar(){
        println("VRUM-VRUUMMMMM")
        println("RANDADAADADADADaNNNNNNN")
    }


}

// para a outra class herdar o carro eu utilizo

//class CarroTunado:Carro(){
//
//}