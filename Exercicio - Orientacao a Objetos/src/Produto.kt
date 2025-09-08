open class Produto(
    private var nome: String,
    private var preco: Double
) {
    fun getNome(): String = nome
    fun setNome(nome: String) { this.nome = nome }

    fun getPreco(): Double = preco
    fun setPreco(preco: Double) { this.preco = preco }
}
