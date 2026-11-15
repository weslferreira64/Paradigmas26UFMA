package notificacoes;

import java.util.ArrayList;
import java.util.List;

public class CentralNotificacoes {
    private final List<Notificacao> fila = new ArrayList<>();
    private int totalEnviado = 0;

    public void adicionar(Notificacao n) {
        fila.add(n);
    }

    public void enviarTodas() {
        for (Notificacao n : fila) {          // polimorfismo
            n.enviar();
            if (n instanceof Agendavel a) {   // instanceof
                System.out.println("  " + a.descricaoAgendamento());
            }
            totalEnviado++;
        }
        System.out.println("Total enviado: " + totalEnviado);
    }
}
