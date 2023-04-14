class WhileLoop {
    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos","Frango")
    /*Estrutura de Repetição While
    *   while (true) {
    *       //instruções
    *   }
    * */
    fun WhileLoop() {
        var contador = 0
        //Pode ser utilizado -1 ou utilizado sinal de menor
        while(contador < listaCompras.size){
            println(listaCompras[contador])
            contador++
        }
    }
}