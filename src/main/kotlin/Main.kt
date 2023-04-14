fun main(args: Array<String>) {
    val il = ImpressaoLinha()

    il.ImprimeLinha("Variáveis Mutáveis e Não Mutáveis")
    val v = VariaveisMutaveisENaoMutaveis()
    v.variaveis()

    il.ImprimeLinha("Tipos de Variáveis")
    val tiposv = TiposDeVariaveis()
    tiposv.TiposDeVariaveis()

    il.ImprimeLinha("Concatenação")
    val conc = Concatenacao()
    conc.Concatenacao()

    il.ImprimeLinha("Operadores Aritméticos")
    val op = OperadoresAritmeticos()
    op.OperadoresAritmeticos()

    il.ImprimeLinha("Operadores Relacionais")
    val or = OperadoresRelacionais()
    or.OperadoresRelacionais()

    il.ImprimeLinha("Estrutura Condicional")
    val ec = EstruturaCondicional()
    ec.EstruturaCondicional()

    il.ImprimeLinha("Operadores Lógicos")
    val ol = OperadoresLogicos()
    ol.OperadoresLogicos()

    il.ImprimeLinha("Arrays - Exemplo Lista de Compras")
    var a = ArraysListaDeCompras()
    a.ArraysListaDeCompras()

    il.ImprimeLinha("Estrutura de Repetição While")
    var whl = WhileLoop()
    whl.WhileLoop()

    il.ImprimeLinha("Estrutura de Repetição For")
    var fr = ForLoop()
    fr.ForLoop()

    il.ImprimeLinha("Estrutura de Repetição When")
    var wh = WhenLoop()
    wh.WhenLoop()

}