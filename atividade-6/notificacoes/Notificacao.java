package notificacoes;

public abstract class Notificacao {
    protected final String destinatario;
    protected final String mensagem;

    protected Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    protected abstract String formatar();

    private void validar() {
        if (destinatario == null || destinatario.isBlank()
                || mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("Destinatário e mensagem são obrigatórios");
        }
    }

    // Template Method: o esqueleto é fixo, só formatar() varia
    public final void enviar() {
        validar();
        System.out.println(formatar());
    }
}
