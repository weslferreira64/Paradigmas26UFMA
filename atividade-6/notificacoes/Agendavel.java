package notificacoes;

import java.time.LocalTime;

public interface Agendavel {
    LocalTime getHorario();

    default String descricaoAgendamento() {
        return getHorario() == null
            ? "envio imediato"
            : "agendado para " + getHorario();
    }
}
