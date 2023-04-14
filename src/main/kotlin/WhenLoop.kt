class WhenLoop {
    /*Estrutura de Repetição When
    * utilizada para testes condicionais
    * when (true) {
    *   instruções
    * }
    */
    fun WhenLoop(){

        /*Método 1:*/
        var opcao = 1
        when(opcao) {
            1 -> println("Suco de Laranja")
            2 -> println("Suco de uva")
            3 -> println("Suco de suco de morango")
            else -> println("Nenhuma opção foi selecionada")
        }
        /*Método 2: colocando o loop em uma variável*/
        var mensagem = when(opcao) {
            1 -> "Suco de laranja"
            2 -> println("Suco de uva")
            3 -> println("Suco de suco de morango")
            else -> println("Nenhuma opção foi selecionada")
        }
        println(mensagem)
    }
}