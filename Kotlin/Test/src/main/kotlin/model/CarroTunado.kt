package model

class CarroTunado:Carro() {
    var ranking: Char = 'f'
    // para sobreescrever algo só eu usar o "override"
    override fun acelerar() {
        println("TZUUUUUUUUUU-UNUUUUUUU-TUTUUTUTUTUTUTU")
    }
}