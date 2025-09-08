 class Pedido(
    private val cliente: Cliente,
    private val produtos: MutableList<Produto> = mutableListOf()
) {

    private fun calculaFrete(peso: Double): Double {
        return peso * 5.00
    }

    private fun calculaSubtotal(): Double {
        var subtotal = 0.0
        for (produto in produtos) {
            subtotal += produto.getPreco()
        }
        return subtotal
    }

    fun adicionarProduto(p: Produto) {
        if (p != null){
            produtos.add(p)
        } else {
            println("Produto inválido.");
        }
    }

    fun finalizar(){
        println("Nome do cliente: ${cliente.getNome()}")
        println("Email do cliente: ${cliente.getEmail()}")
        println("Subtotal dos produtos: ${calculaSubtotal()}")
        println("Valor dos descontos: ")
        println("Valor do frete: ")
        println("Valor final do pedido: ${calculaSubtotal()}")
    }
}
