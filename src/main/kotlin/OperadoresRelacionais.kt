class OperadoresRelacionais {
    fun OperadoresRelacionais() {
        /*Operadores Relacionais
* Operador de igual: ==
* Operador de Menor: <
* Operador de Maior: >
* Operador de Menor ou igual <=
* Operador de Maior ou igual >=
* Operador de Diferente !=
* */

        var valor1: Byte = 20
        var valor2: Byte = 10

        println(valor1 == valor2) /*Retornará false*/
        println(valor1 < valor2) /*Retornará false*/
        println(valor1 > valor2) /*Retornará true*/
        println(valor1 <= valor2) /*Retornará false*/
        println(valor1 >= valor2) /*Retornará true*/
        println(valor1 != valor2) /*Retornará true*/
    }
}