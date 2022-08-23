fun main() {
try{
    println("Digite o seu nome: ")
    var nome = readln()
   println("Digite seu endereço: ")
   var endereco = readln()
   println("Digite seu telefone: ")
   var telefone = readln().toInt()
   val Cliente1 = Cliente(nome, endereco, telefone)
   println("Olá, " + Cliente1.nome)
   println("Seu endereço é: " + Cliente1.endereco)
   println("Seu telefone é: " + Cliente1.telefone)

 while (true) {
     println()

     println("1 - CADASTRAR PRODUTOS")
     println("2 - REMOVER PRODUTOS")
     println("3-LISTAR PRODUTOS")
     println("4- SAIR")

     when (readln().toInt()) {
         1 -> {
             println("Digite o produto para cadastrar: ")
             val addProdutos = readln()
             Cliente1.addProdutos(addProdutos)
             println("Produto adicionado com sucesso!")
         }

         2 -> {
             println("Digite o nome do produto para remover")
             val removeProdutos = readln()
             Cliente1.removerProdutos(removeProdutos)
             println("Produto removido com sucesso!")
         }

         3 -> {
             println("exibindo produtos...")
             Cliente1.exibirProdutos()


         }

         4 -> {
             break
         }

     }
 }
}catch (e:Exception){
    println(e)
}

}