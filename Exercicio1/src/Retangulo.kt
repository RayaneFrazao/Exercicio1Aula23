class Retangulo : FigurasGeometrica {

        override var area: Double = 0.0
        override val forma= "Retangulo"
        private var medidaBase = 0.0
        private var medidaAltura = 0.0

        override fun DigiteDados() {
            println("CALCULE A ÁREA DO retangulo ")
            print("Digite a base: ")
            medidaBase = readln().toDouble()
            print("Digite a altura: ")
            medidaAltura = readln().toDouble()
        }
        override fun calcularForma() {
            area = medidaBase * medidaAltura
        }
}
