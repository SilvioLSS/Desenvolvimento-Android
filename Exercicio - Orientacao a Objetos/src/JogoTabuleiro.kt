class JogoTabuleiro(
    private val editora: String,
    peso: Double,
    nome: String,
    preco: Double
    ) : ProdutoFisico(peso, nome, preco) {

    fun getEditora(): String = editora

}