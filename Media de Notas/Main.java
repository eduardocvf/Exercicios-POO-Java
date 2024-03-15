import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora de Média!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira Nota => ");
        double nota1 = scanner.nextDouble();

        System.out.print("Insira a segunda Nota => ");
        double nota2 = scanner.nextDouble();

        System.out.print("Insira a terceira Nota => ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média das 3 notas é => " + media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;


    }
}
