fun main(args: Array<String>) {
    println("********************************************************")

    println("Exercicio 1")
    println("Crie uma variável numérica e diga se o número é par ou (resto da divisão por" +
            "2 = 0) ímpar (resto da divisão por 2 = 1)\n")
    exercicio1()

    println("********************************************************")

    println("Exercicio 2")
    println("Crie uma variável numérica e exiba se o número é positivo, negativo ou zero\n")
    exercicio2()

    println("********************************************************")

    println("Exercicio 3")
    println("Crie uma variável idade e diga \"Criança\" caso seja menor de 12," +
            "\"Adolescente\" entre 12 e 17, \"Adulto\" entre 18 e 59 e \"Idoso\" se 60 ou mais\n")
    exercicio3()

    println("********************************************************")

    println("Exercicio 4")
    println("Crie uma variável numérica e exiba sua tabuada de 1 a 10\n")
    exercicio4()

    println("********************************************************")

    println("Exercicio 5")
    println("Dado um array de números, calcule a soma de todos eles (ex: [1,2,3,4] → 10)\n")
    println("AVISAR O PROFESSOR DA MINHA GAMBIARRA")
    exercicio5()

    println("********************************************************")

    println("Exercicio 6")
    println("Encontre o maior número dentro de um array (ex: [5,8,2,10,3] → 10)\n")
    exercicio6()

    println("********************************************************")

    println("Exercicio 7")
    println("Crie uma variável numérica e exiba uma contagem regressiva até zero\n")
    exercicio7()

    println("********************************************************")

    println("Exercicio 8")
    println("Dado um array de números, calcule somente a soma dos números pares (ex:" +
            "[1,2,3,4] → 6)\n")
    exercicio8()

    println("********************************************************")

    println("Exercicio 9")
    println("Crie uma função que receba um número e retorne o dobro dele\n")
    exercicio9()

    println("********************************************************")

    println("Exercicio 10")
    println("Faça uma função que receba 3 notas e retorne a média do aluno\n")
    exercicio10()

    println("********************************************************")

    println("Exercicio 11")
    println(" Faça uma função que receba uma temperatura Celsius (ponto flutuante) e " +
            "retorne o valor em Fahrenheit (fórmula: F = C x 1.8 + 32)\n")
    exercicio11()
}

fun exercicio1(){
    var numeroDividir = 20
    numeroDividir %= 2
    if(numeroDividir == 0){
        println("------------------------------------")
        println("O número é Par ")
        println("------------------------------------")
    }
    else{
        println("------------------------------------")
        println("O número é Impar ")
        println("------------------------------------")
    }
}

fun exercicio2(){
    val valorNumerico = 4
    println("------------------------------------")

    println("Valor que você colocou é $valorNumerico")
    val descobrirValorNumerico = when{
        valorNumerico > 0 -> "positico"
        valorNumerico < 0 -> "Negativo"
        else -> "Zero"
    }
    println(descobrirValorNumerico)

    println("------------------------------------")
}

fun exercicio3(){
    val idade = 4
    println("------------------------------------")

    println("A idade que você falou é $idade")

    val validarIdade = when(idade){
        in  0..12 -> "Menor de idade"
        in 12 ..17 -> "Adolecente"
        in 18 .. 59 -> "Adulto"
        else -> "Idoso"
    }

    println(validarIdade)
    println("------------------------------------")
}

fun exercicio4(){
    for(i2 in 1..10){
        println("Tabuada do 1 * $i2 que da: ${1*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 2 * $i2 que da: ${2*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 3 * $i2 que da: ${3*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 4 * $i2 que da: ${4*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 5 * $i2 que da: ${5*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 6 * $i2 que da: ${6*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 7 * $i2 que da: ${7*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 8 * $i2 que da: ${8*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 9 * $i2 que da: ${9*i2}")
    }

    println("------------------------------------")
    for(i2 in 1..10){
        println("Tabuada do 10 * $i2 que da: ${10*i2}")
    }
}

fun exercicio5(){
    //  AVISAR PROFESSOR

//    var i = 0
//    val numeroFinalCalcular = 10
//    while (i < numeroFinalCalcular){
//        val numeros = arrayOf(1 .. 10)
//        println(numeros)
//
//        i++
//    }

    println("------------------------------------")
    var numeros = arrayOf(1,2,3,4,5,6,7,8,9,10)
                    // sum serve para calcular numeros dentro do array
    println(numeros.sum())

}

fun exercicio6(){
    println("------------------------------------")
    var numeros = arrayOf(1,2,3,4,5,6,7,8,9,10)
    // max serve para achar o maior numero do array
    // tem o maxOrNull que faz a mesma coisa e verifica se é nulo ou não
    println(numeros.max())
}

fun exercicio7(){
    for(i in 10 downTo 0){
        println("Contagem: $i")
        println("------------------------------------")
    }
}

fun exercicio8(){
    var numeros = arrayOf(1,2,3,4,5,6,7,8,9,10)
    println("A soma dos números pares é de: ${numeros.filter { it % 2 == 0 }.sum()}")
}

fun exercicio9(){
    val valorReceber = 90
    println("Você me enviou o valor de $valorReceber, o dobro dele será ${valorReceber * 2}")
}

fun exercicio10(){
    val nota1 = 7
    val nota2 = 2
    val nota3 = 5

    val media = (nota1 + nota2 + nota3) / 3

    println("Vou calcular sua média, mas para você saber: \n" +
            "nota 1: $nota1 \n" +
            "nota 2: $nota2\n" +
            "nota 3: $nota3\n" +
            "A média então é de: $media")
}

fun exercicio11(){
    val valorCelsius = 34.2
    var conversorFahrenheit = (valorCelsius * 1.8) + 32

    println("Está com $valorCelsius graus Celsius. Convertendo para Fahrenheit dá: $conversorFahrenheit")
}
