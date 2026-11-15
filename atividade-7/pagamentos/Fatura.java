package pagamentos;

public class Fatura implements Pagavel, Exportavel {
    private String descricao;
    private double total;

    public Fatura(String descricao, double total) {
        this.descricao = descricao;
        this.total = total;
    }

    @Override
    public double valorAPagar() {
        return total;
    }

    @Override
    public String paraCsv() {
        return descricao + ";" + total;
    }
}
