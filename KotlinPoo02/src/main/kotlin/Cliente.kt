class Cliente(
    val nome: String,
    val endereco: String,
    val telefone: Int,


    ) {


    private var listaProdutos = mutableListOf<String>()

    init{
        verificarString()
    }

    fun addProdutos(produto: String) {
        listaProdutos.add(produto)
    }


    fun exibirProdutos() {
        listaProdutos.forEach {
            println(it)
        }
    }

    fun removerProdutos(produto: String) {

        listaProdutos.remove(produto)


    }

    fun verificarString(){
        if (nome == "" ){
         throw Exception("Não é permitido deixar em branco")
        }
    }
}











