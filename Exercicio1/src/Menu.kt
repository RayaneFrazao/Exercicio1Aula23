import kotlin.system.exitProcess

class Menu {
    fun menuSelecionarFiguraGeometrica() {
        println("Escolha a forma geometrica ")
        println("[1] Quadrado")
        println("[2] Retângulo")
        println("[3] Final")
        print("Digite o numero da figura geometrica escolhida: ")
        when (readln().toInt()) {
            1 -> {
                val novoQuadrado: FigurasGeometrica = Quadrado()
                novoQuadrado.DigiteDados()
                novoQuadrado.calcularForma()
                exibirAreaForma(novoQuadrado)
                menuContinuar()
            }
            2 -> {
                val novoRetangulo: FigurasGeometrica = Retangulo()
                novoRetangulo.DigiteDados()
                novoRetangulo.calcularForma()
                exibirAreaForma(novoRetangulo)
                menuContinuar()
            }
            3 -> exitProcess(0)
            else -> {
                println("Opção inválida")
                menuSelecionarFiguraGeometrica()
            }
        }
    }

    private fun exibirAreaForma( figuraGeometrica: FigurasGeometrica) {
         println(" A area do ${figuraGeometrica.forma} é ${figuraGeometrica.area}")
    }

    fun menuContinuar() {
        println("Deseja calcular novamente?")
        println("[1] SIM")
        println("[2] NÃO")
        print("Digite o numero da opção escolhida: ")
        when (readln().toInt()) {
            1 -> menuSelecionarFiguraGeometrica()
            2 -> exitProcess(0)
            else -> {
                println("Opção inválida")
                menuContinuar()
            }
        }
    }
}

