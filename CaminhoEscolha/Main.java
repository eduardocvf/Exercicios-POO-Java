import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo à Escolha do Caminho!");


        System.out.println("Opções de Caminho:");
        System.out.println(" ");
        System.out.println("A - Caminho A");
        System.out.println("B - Caminho B");
        System.out.println("C - Caminho C");

        System.out.print("Escolha um caminho (Digite a letra correspondente): ");
        Scanner scanner = new Scanner(System.in);
        char escolha = scanner.next().charAt(0);

        switch (escolha) {
            case 'A':
            case 'a':
                System.out.println("Escolheu o Caminho A: É um caminho seguro e tranquilo!");
                break;
            case 'B':
            case 'b':
                System.out.println("Escolheu o Caminho B: Este caminho é desafiador, mas cheio de recompensas!");
                break;
            case 'C':
            case 'c':
                System.out.println("Escolheu o Caminho C: Este caminho é misterioso e cheio de surpresas!");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
        }
    }

}