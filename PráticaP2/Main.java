import java.util.Scanner;

// Classe Aluno: Encapsula os atributos (estado) e métodos (comportamento)
class Aluno {
    // Atributos privados (Encapsulamento)
    private String nome;
    private float nota1;
    private float nota2;

    // Construtor: Inicializa o objeto com os dados fornecidos
    public Aluno(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média
    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0f;
    }

    // Método para verificar se o aluno foi aprovado
    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0f;
    }

    // Método para exibir o resultado final
    public void mostrarResultado() {
        float media = calcularMedia();
        System.out.println("\nAluno: " + this.nome);
        System.out.printf("Média: %.2f\n", media);

        if (verificarAprovacao()) {
            System.out.println("Status: Aprovado!");
        } else {
            System.out.println("Status: Reprovado!");
        }
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a 1° nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a 2° nota: ");
        float nota2 = scanner.nextFloat();

        // Instanciação do Objeto (Criando um novo Aluno)
        Aluno aluno = new Aluno(nome, nota1, nota2);

        // Chamada do método do objeto
        aluno.mostrarResultado();

        scanner.close();
    }
}

// Alunos: Wesley Oliveira Ferreira e José Mauro Santos Borges
