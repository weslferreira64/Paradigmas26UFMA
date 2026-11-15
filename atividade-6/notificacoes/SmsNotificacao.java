package notificacoes;

public class SmsNotificacao extends Notificacao {
    public SmsNotificacao(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    protected String formatar() {
        return "[SMS] para " + destinatario + ": " + mensagem;
    }
}
