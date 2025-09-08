class LivroFisico(
    private val editora: String,
    private val isbn: String,
    peso: Double,
    nome: String,
    preco: Double
    ) : ProdutoFisico(peso, nome, preco) {

    fun getEditora(): String = editora;
    fun getISBN(): String = isbn;
}