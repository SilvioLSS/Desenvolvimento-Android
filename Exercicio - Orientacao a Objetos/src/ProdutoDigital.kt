open class ProdutoDigital(
    private val tamanhoArquivo: Double,
    nome: String,
    preco: Double
) : Produto(nome, preco) {

    fun getTamanhoArquivo(): Double = tamanhoArquivo;
}