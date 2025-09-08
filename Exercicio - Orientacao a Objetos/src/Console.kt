class Console(
    private val fabricante: String,
    nome: String,
    preco: Double,
    peso: Double
) : ProdutoFisico(
    peso,
    nome,
    preco) {

    fun getFabricante(): String = fabricante

}