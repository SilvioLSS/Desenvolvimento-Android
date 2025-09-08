class JogoDigital(
    private val estudio: String,
    tamanhoArquivo: Double,
    nome: String,
    preco: Double
) : ProdutoDigital(tamanhoArquivo, nome, preco), Enviavel{

    fun getEstudio(): String = estudio

    override fun enviarPorEmail() {

    }

}