import java.util.Arrays

class ArraysListaDeCompras {
    fun ArraysListaDeCompras() {
        /*Arrays: Exemplo de Lista de Compras*/
        //0         1        2        3        4        5       6        7       8
        var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos","Frango")
        var listaNumeros = arrayOf(10,20,30,40,50)

        println(listaCompras[0]) //Array de String, mas também pode conter valores de outros tipos-> listando apenas o valor do index 0
        println(listaNumeros[2])

        //Listando todos os valores do Array:
        println(Arrays.toString(listaCompras))

        //Verificando o tamanho total do Array:
        println(listaCompras.size)
    }

}