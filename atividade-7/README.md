
INICIO
    pagaveis <- lista de Pagavel
    pagaveis.adicionar(novo Funcionario("Ana", 3500.00))
    pagaveis.adicionar(novo Fatura("Energia", 280.50))

    PARA CADA p EM pagaveis FACA
        ESCREVA p.recibo()
    FIM PARA

    e <- novo Funcionario("Ana", 3500.00)    // visto como Exportavel
    ESCREVA e.paraCsv()
FIM
