package notificacoes;

import java.time.LocalTime;

public class PushNotificacao extends Notificacao implements Agendavel {
    public PushNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public LocalTime getHorario() { return null; } // imediato

    @Override
    protected String formatar() {
        return "[PUSH] para " + destinatario + ": " + mensagem;
    }
}
