import java.util.Scanner;

public class CalculadoraTriangulos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Bem-vindo à Calculadora de Triângulos.");
        System.out.println(" ");

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                calcularArea(scanner);
            }
            else if (opcao == 2) {
                calcularAngulos(scanner);
            }
            else if (opcao == 3) {
                System.out.println("Obrigado por usar a Calculadora de Triângulos. Até breve!");
                scanner.close();
                System.exit(0);
            }
            else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void exibirMenu() {

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular a área do triângulo.");
        System.out.println("2. Calcular os ângulos do triângulo (opcional).");
        System.out.println("3. Sair do programa.");
        System.out.println(" ");
        System.out.print("Opção: ");
    }

    private static void calcularArea(Scanner scanner) {
        System.out.println("Digite os comprimentos dos três lados do triângulo:");

        System.out.print("Digite o valor do Lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Digite o valor do Lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Digite o valor do Lado C: ");
        double ladoC = scanner.nextDouble();

        if (eTrianguloValido(ladoA, ladoB, ladoC)) {
            double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
            double area = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
            System.out.println(" ");
            System.out.println("A área do triângulo é: " + area);
            determinarTipoTriangulo(ladoA, ladoB, ladoC);
        }
        else {
            System.out.println(" ");
            System.out.println("Os comprimentos dos lados não formam um triângulo válido. Por favor, tente novamente.");
        }
    }

    private static void calcularAngulos(Scanner scanner) {
        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        System.out.print("Digite o valor do Lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Digite o valor do Lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Digite o valor do Lado C: ");
        double ladoC = scanner.nextDouble();
        System.out.println(" ");

        if (eTrianguloValido(ladoA, ladoB, ladoC)) {
            double cosA = (ladoB * ladoB + ladoC * ladoC - ladoA * ladoA) / (2 * ladoB * ladoC);
            double cosB = (ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (2 * ladoA * ladoC);

            double anguloA = Math.toDegrees(Math.acos(cosA));
            double anguloB = Math.toDegrees(Math.acos(cosB));
            double anguloC = 180 - anguloA - anguloB;

            System.out.println("Os ângulos do triângulo são:");
            System.out.println("Ângulo A: " + anguloA + "°");
            System.out.println("Ângulo B: " + anguloB + "°");
            System.out.println("Ângulo C: " + anguloC + "°");
            determinarTipoTriangulo(ladoA, ladoB, ladoC);
        }
        else {
            System.out.println("Os comprimentos dos lados não formam um triângulo válido. Por favor, tente novamente.");
        }
    }

    private static boolean eTrianguloValido(double ladoA, double ladoB, double ladoC) {
        return (ladoA > 0 && ladoB > 0 && ladoC > 0) && (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    private static void determinarTipoTriangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triângulo é equilátero (todos os lados iguais).");
            System.out.println(" ");
        }
        else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("O triângulo é isósceles (dois lados iguais).");
            System.out.println(" ");
        }
        else {
            System.out.println("O triângulo é escaleno (todos os lados diferentes).");
            System.out.println(" ");
        }
    }
}
