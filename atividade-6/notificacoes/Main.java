package notificacoes;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String msg = "Reunião do squad hoje às 19h!";
        CentralNotificacoes central = new CentralNotificacoes();

        central.adicionar(new EmailNotificacao("aluno@ufma.br", msg, LocalTime.of(8, 0)));
        central.adicionar(new SmsNotificacao("99 99999-0000", msg));
        central.adicionar(new PushNotificacao("app-joao", msg));

        central.enviarTodas();
    }
}
