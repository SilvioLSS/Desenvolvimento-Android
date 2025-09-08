class JogoMidiaFisica(
    private val estudio: String,
    peso: Double,
    nome: String,
    preco: Double
    ) : ProdutoFisico(peso, nome, preco) {

    fun getEstudio(): String = estudio

}