interface Agendavel
    getHorario()                      // pode ser nulo
    default descricaoAgendamento():
        se horario é nulo → "envio imediato"
        senão → "agendado para " + horario

classe abstrata Notificacao
    atributos: destinatario, mensagem
    abstrato formatar()               // cada canal monta seu texto
    enviar():                         // Template Method (final)
        validar()                     // destinatário e mensagem não vazios
        imprimir(formatar())

Email, Sms, Push estendem Notificacao
    Email e Push também implementam Agendavel
    cada um implementa formatar()

CentralNotificacoes
    lista de Notificacao, contador
    adicionar(n)
    enviarTodas():
        para cada n na lista:
            n.enviar()
            se n é Agendavel → imprimir descricaoAgendamento()
            contador++
        imprimir "Total enviado: " + contador

Main: cria 3 notificações, adiciona na central, chama enviarTodas()
