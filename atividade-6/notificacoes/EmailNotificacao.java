package notificacoes;

import java.time.LocalTime;

public class EmailNotificacao extends Notificacao implements Agendavel {
    private final LocalTime horario;

    public EmailNotificacao(String destinatario, String mensagem, LocalTime horario) {
        super(destinatario, mensagem);
        this.horario = horario;
    }

    @Override
    public LocalTime getHorario() { return horario; }

    @Override
    protected String formatar() {
        return "[E-MAIL] para " + destinatario + ": " + mensagem;
    }
}
