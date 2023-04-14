class Concatenacao {
    fun Concatenacao() {
        var name = "Iasmim"
        var age = 22
        var profissao = "Programadora Web Full Stack"
        /*Opção 1 - Mesma coisa quando fazemos no java*/
        println("Meu nome é " + name + " eu tenho " + age + " anos" + " e eu sou " + profissao)
        /*Opção 2 - menos verboso*/
        println("Meu nome é $name eu tenho $age anos e eu sou $profissao")
    }
}