import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private String numeroMatricula;
    private static int totalAlunos = 0;
    private int numeroAluno;

    // Construtor padrão
    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.curso = "";
        this.numeroMatricula = "";
        totalAlunos++;
        this.numeroAluno = totalAlunos;
    }

    // Construtor personalizado
    public Aluno(String nome, int idade, String curso, String numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
        totalAlunos++;
        this.numeroAluno = totalAlunos;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }

    @Override
    public String toString() {
        return numeroAluno + ". " + nome;
    }
}

public class sistemaRegistro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>(); // Armazenar alunos

        // Menu
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar uma instância de aluno");
            System.out.println("2. Exibir informações do aluno");
            System.out.println("3. Mostrar número total de alunos");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    alunos.add(criarAluno(scanner));
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno foi criado ainda.");
                    } else {
                        exibirInformacoesAlunos(alunos);
                    }
                    break;
                case 3:
                    System.out.println("Total de alunos adicionados: " + alunos.size());
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
            }
        }
    }

    // Método para criar aluno
    public static Aluno criarAluno(Scanner scanner) {
        System.out.println("\nDigite as informações do aluno:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Número de matrícula: ");
        String numeroMatricula = scanner.nextLine();

        return new Aluno(nome, idade, curso, numeroMatricula);
    }

    // Método para exibir informações dos alunos
    public static void exibirInformacoesAlunos(ArrayList<Aluno> alunos) {
        System.out.println("\nLista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
        System.out.print("Selecione o número do aluno que deseja visualizar: ");
        Scanner scanner = new Scanner(System.in);
        int numeroAluno = scanner.nextInt();
        scanner.nextLine();

        if (numeroAluno > 0 && numeroAluno <= alunos.size()) {
            System.out.println("\nInformações do aluno:");
            alunos.get(numeroAluno - 1).exibirInformacoes();
        } else {
            System.out.println("Número de aluno inválido.");
        }
    }
}
