class ForLoop {
    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos","Frango")
    /*Estrutura de Repetição For
    * for(contador in intervalo) {
    *   instruções
    *}
    * */
    fun ForLoop() {


        for(indice in 0..listaCompras.size-1) {
            println(listaCompras[indice])
        }
    }
}