open class ProdutoFisico(
    private val peso: Double,
    nome: String,
    preco: Double
) : Produto(nome, preco) {

    fun getPeso(): Double = peso;
}