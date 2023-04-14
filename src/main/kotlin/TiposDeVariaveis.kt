class TiposDeVariaveis {
    fun TiposDeVariaveis() {
        /*Tipos de variáveis
    * string - Textos
    * byte - Números Inteiros (-128 até 127)
    * int - Números Inteiros (-2147483648 até 2147483647)
    * long - Números Inteiros  (-9223372036854775808 até 9223372036854775807)
    * float - Números Decimais (1.1234567 até 7 casas decimais)
    * double - Números Decimais (1.12345678 até 15 casas decimais)
    * boolean - Valores Booleanos (Estados) - true ou false
*/
        /*Kotlin é dinamicamente tipado, sabe o tipo da variável através do valor atribuído*/

        /*Tipo String:*/
        val nomeCompleto = "Iasmim Ferreira de Godoy"
        /*Mas pode ser tipada também, porém é redundante*/
        val nome2: String = "Iasmim Godoy"
        println(nomeCompleto)

        /*Tipo Byte: não consegue ser identificado pelo Kotlin de forma automática, precisamos indicá-lo na variável*/
        val numero: Byte = 127
        println(numero)

        /*Tipo Int: pode ser identificado pelo Kotlin automaticamente*/
        val numero2 = 1
        println(numero)

        /*Tipo Long: pode ser identificado pelo Kotlin automaticamente*/
        val numero3 = 9223372036854775807
        println(numero3)

        /*tipo Float:não pode ser identificado pelo Kotlin automaticamente, deve ser definida manualmente com um F no final, se não colocar ele vai identificar como um Double*/
        /*Se utilizar mais de 7 casas decimais + o F no final, não dará erro, mas só mostrará as 7 casas*/
        val numero4 = 1.1234567F
        println(numero4)

        /*tipo Double: pode ser identificado pelo Kotlin automaticamente*/
        val numero5 = 1.12345678
        println(numero5)

        /*tipo Boolean: pode ser identificado pelo Kotlin automaticamente*/
        val verdadeiro = true
        val falso = false
        println(verdadeiro)
        println(falso)
    }
}