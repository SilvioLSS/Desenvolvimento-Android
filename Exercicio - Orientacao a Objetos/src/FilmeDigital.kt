class FilmeDigital(
    private val estudio: String,
    tamanhoArquivo: Double,
    nome: String,
    preco: Double
) : ProdutoDigital(tamanhoArquivo, nome, preco){

    fun getEstudio(): String = estudio;

}