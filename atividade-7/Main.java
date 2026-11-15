import java.util.List;
import pagamentos.*;

public class Main {
    public static void main(String[] args) {
        List<Pagavel> pagaveis = List.of(
            new Funcionario("Ana", 3500.00),
            new Fatura("Energia", 280.50)
        );

        for (Pagavel p : pagaveis) {
            System.out.println(p.recibo());
        }

        Exportavel e = new Funcionario("Ana", 3500.00);
        System.out.println(e.paraCsv());
    }
}
