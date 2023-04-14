class OperadoresLogicos {
    fun OperadoresLogicos() {
        /*Operadores Lógicos
* && -> and (e)
* || -> or (ou)
*/
        if (20 == 20 && 10 < 20) {
            println("Verdadeiro")
        } else{
            println("Falso")
        } //Retorno Verdadeiro

        if (20 == 20 && 20 < 20) {
            println("Verdadeiro")
        } else{
            println("Falso")
        } //Retorno Falso

        if (20 == 20 || 20 < 20) {
            println("Verdadeiro")
        } else{
            println("Falso")
        } //Retorno Verdadeiro
    }
}