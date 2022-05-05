class Quadrado : FigurasGeometrica {

    override var area: Double = 0.0
    override val forma = "Quadrado"
    private var medidaQuadrado = 0.0

    override fun DigiteDados() {
        println("CALCULE A ÁREA DO QUADRADO ")
        print("Digite o lado do quadrado: ")
        medidaQuadrado = readln().toDouble()
    }

    override fun calcularForma() {
        area = (medidaQuadrado * medidaQuadrado)
    }
}