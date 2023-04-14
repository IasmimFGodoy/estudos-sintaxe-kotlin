class EstruturaCondicional {
    fun EstruturaCondicional() {
        /*Estrutura Condicional - if/else*/
        //se (if) Senão (else)
        /*    if (true){
                //será executado
            }else { //caso contrário
                //o bloco do else será executado
            }
        */
        if (true){
            println("Verdadeiro")
        }else { //Se a condição do if fosse false, seria printado "Falso" no console
            println("Falso")
        }
        var age2 = 18
        if (age2 >= 18){
            println("O usuário é Adulto")
        }else { //Se a condição do if fosse false, seria printado "Falso" no console
            println("O usuário é menor de idade")
        }
        age2 = 17
        /*Definindo outras tomadas de decisão*/
        if (age2 <= 10){
            println("Criança")
        }else if(age2<=17) { //senão + se
            println("Adolescente")
        } else { //Valores acima de 17
            println("Adulto")
        }
    }
}