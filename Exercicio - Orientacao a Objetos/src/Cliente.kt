class Cliente(
    private var nome: String,
    private var email: String
) {
    fun getNome(): String = nome
    fun getEmail(): String = email
}