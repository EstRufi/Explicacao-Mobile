// fun = função
// Sempre começa com main na hora de executar
fun main() {
    // para printar no terminal vc usa print ou println
    println("Hello World!!!!!!")
    println("*********************************************")
    // val é igual ao const do js pq ele não deve mudar
    val pi = 3.14

    println("$pi aqui o val não muda")
    println("*********************************************")
    // var é algo que pode se alterar o valor
    var idade = 18
    println("$idade aqui é utilizando o nosso var")

    idade = 66
    println("$idade eu alterei o valor de var e funciono")

    println("*********************************************")

    var idadee: Int = 8
    println("$idadee eu falei que to usando int aquiiii")

    println("*********************************************")

    val texto = "Bom dia, Senhores!!"
    println(texto)

    // Aqui diz qual o tamanho da sua String
    println(texto.length)
    //Aqui já deixa em letra Miuscula
    println(texto.uppercase())
    // Aqui é uma forma de confirmar se é ou não um boolean com base na palavra
    println(texto.contains("Pessoal"))

    println("*********************************************")

    // Aqui eu posso fazer equações dentro de um texto
    println("Nossa alegra que tenho $idade anos, pera agora tenho ${idade*6 / (4+ idadee *2 )} socorroooo")

    println("*********************************************")
    //  ao colocar  tres """ aspas duplas  vc consegue escrever respeitando os enters e os tabs que tem
    println("""
        uche
            dewde
        wd
        e
        wd
     
    """)
    // mas se usarmos o .trimIndent ele ignora os tabs
    println("""
        uche
            dewde
        wd
        e
        wd
     
    """.trimIndent())

    println("*********************************************")
    // para salvar somente algo pequeno podemos usar '' simples para poder dizer oq eu quero é algo grande
    val carcter = '%'
    println(carcter)

    println("*********************************************")
    val bloaeno = true
    // o buleano tem varias formas de utilizar o .
    println(bloaeno)

    println("*********************************************")
    // Temos o int para guardar 32 bits mas se for algo maior utilizamos o long
    val populacaoBrasileira = 7_000_000_000_0L // é obrigatório utilizar o L maiusculo
    // se colocar o _ underlaine no número vc poderá facilitar sua leitura e não aparecerá no código
    println(populacaoBrasileira)

    println("*********************************************")
    val float = 75.123456f // para dizer que é float temos que usar o F ou f
    // ele tbm arrendonda o valor mas ao utilizarmos o doble
    val doble = 12.123456
    println("$float ele aqui irá aredondar mas ao utilizarmos doble $doble ele fica exato o valor que colocarmos")
    println("*********************************************")
    // Ao utilizarmos a troca de grandezas podemos fazer da seguinte forma
    val x: Int = 10
    val y: Double = x.toDouble()
    // Mas ao utilizarmos isso estamos sacrificando o nosso numero inteiro. Então vira um double

    // Mas por que ele não deixa ir sozinho?, vc que tem que colocar sozinho para que vc tenha conciencia doque está fazendo para não dar chuchu
    // val z: Double = x

    // Aqui vc chama a função que vc criou a baixo
    nomeFuncao()

    // Ele faz a mesma coisa do println que é pular uma linha
    print("\n")
    println("*********************************************")
    // Aqui vamos aprender como faz conta com valores pré definidos
    var c = 10
    var d = 10
    var e = 10
    var f = 10
    var g = 10

    // como podemos fazer isso?

    // o += significa eu estou somando o valor com oq esta na frente
    c += 5
    println("Aqui ta pegando o valor e somando que ta dando: $c")

    // o -= significa eu estou diminuindo o valor com oq esta na frente
    d -= 5
    println("Aqui ta pegando o valor e subtraindo que ta dando: $d")

    e *= 5
    println("Aqui ta pegando o valor e subtraindo que ta dando: $d")

    f /= 5
    println("Aqui ta pegando o valor e subtraindo que ta dando: $d")

    g %= 5 // ????
    println("Aqui ta pegando o valor e subtraindo que ta dando: $d")

    // ao enviar um valor, posso enviar de forma aleatória
    mensagemParabens(idade = 10,nome = "oi")

    val outraIdade = 18

    if (outraIdade >= 18){
        println("Maior de idade")
    }
    else{
        println("Menor de idade")
    }

    val nota = 7

    if (nota >=9){
        println("Exelente")
    }
    else if(nota >=6){
        println("Bom")
    }
    else{
        println("Reprovadoooo")
    }


    val idade2 = 12

    val status = if (idade2 >=18){
        "Maior de idade"
    }
    else{
        "Menor de idade"
    }

//    var status = ""
//    if (idade2 >=18){
//        status = "Maior de idade"
//    }
//    else{
//        status = "Menor de idade"
//    }
    println(status)

    println("*********************************************")
    val idade3 = 20
    println(if(idade3 >=18)"Maior" else "Menor")

    println("*********************************************")
    val dia = 3

    // Ele faz conparacao entre o valor recebido com o que vc diz
    when (dia){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        else -> println("Dia inválido")
    }

    println("*********************************************")

    // Aqui novamente tem a comparação porém mostra que posso colocar mais de um valor
    val nota1 = 10
    when (nota1){
        9,10 -> println("Excelente")
        8,7 -> println("Bom")
        6 -> println("Regular")
        else -> println("Reprovado")
    }

    println("*********************************************")
    val dia2 = 1

    val nomeDia = when (dia2){
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        else -> "Outro dia"
    }
    println(nomeDia)

    println("*********************************************")
    val nota2 =1
    when {
        nota2 >= 9 -> println("Excelente")
        nota2 >=6 -> println("Bom")
        else -> println("Reprovado")
    }

    println("*********************************************")

    // Por padrão
    // O kotlin não permite que o valor vire algo nulo, por segurança
//    var nome3: String = "Joao"
//    nome3 = null

    // mas se eu precisar que venha string mas pode vir tbm nulo utilizamos o "?". O ? significa aquele será? ou talvez Pode acontecer ne?
    // assim desta forma ele pode funcionar
    var nome3: String? = "joao"
    nome3 = null

    // alem disso o kotlin faz a gente tratar o dado que vem nulo

//    if(nome3 != null){
//        println(nome3.length)
//    }

    // podemos fazer da seguinte forma tbm
    // O elvis (?) no caso a baixo está validando a função
    println(nome3?.length)

    println("*********************************************")

    // Parte do Array porem pouco utilizado

    var numeros = arrayOf(1,2,3)
    println(numeros[0]) // 1

    numeros[1] = 50
    println(numeros[1]) // 50

    println("*********************************************")

//    var numeros1 = arrayOf(1,2,2)
//    numeros1 = "joao" // n funciona
//    println(numeros1[3]) // n funciona

//    var frutas = listOf("Banana","Maça","Maça") // ela nao muda
//    println(frutas[0])
//    frutas.add("Limão") // nao funciona
//    frutas.remove(2) // n funciona

    var frutas = listOf("Banana","Maçã","Laranja")
    println(frutas.size)
    println(frutas.first())
    println(frutas.last())
    println(frutas.contains("Maçã"))

}
}

fun nomeFuncao(){
    println("Teste da função em andamento")
}
// Ao declararmos os parametros e é preciso escrever o que quero e o tipo dele
fun mensagemParabens(nome: String, idade: Int){
    println("*********************************************")
    println("Parabeis $nome vc tem $idade agora")
}
