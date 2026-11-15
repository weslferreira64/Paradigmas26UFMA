package pagamentos;

public class Funcionario implements Pagavel, Exportavel {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double valorAPagar() {
        return salario;
    }

    @Override
    public String paraCsv() {
        return nome + ";" + salario;
    }
}
