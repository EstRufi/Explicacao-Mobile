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
    val populacaoBrasileira = 70000000000L // é obrigatório utilizar o L maiusculo
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
}


