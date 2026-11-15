package pagamentos;

public interface Pagavel {
    double valorAPagar();

    default String recibo() {
        return String.format("Recibo: R$ %.2f", valorAPagar());
    }
}
