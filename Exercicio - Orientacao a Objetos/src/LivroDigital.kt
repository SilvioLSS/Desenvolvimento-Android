class LivroDigital(
    private val editora: String,
    private val isbn: String,
    tamanhoArquivo: Double,
    nome: String,
    preco: Double
) : ProdutoDigital(tamanhoArquivo, nome, preco), Enviavel{

    fun getEditora(): String = editora;
    fun getISBN(): String = isbn;

    override fun enviarPorEmail() {

    }

}