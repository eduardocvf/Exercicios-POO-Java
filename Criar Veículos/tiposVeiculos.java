import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Veiculo {
    protected String marca;
    protected int ano;
    protected String tipoVeiculo;

    public Veiculo(String marca, int ano, String tipoVeiculo) {
        this.marca = marca;
        this.ano = ano;
        this.tipoVeiculo = tipoVeiculo;
    }
    public void apresentar() {
        System.out.println("Tipo de Veículo: " + tipoVeiculo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private final int numPortas;

    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano, "Carro");
        this.numPortas = numPortas;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Número de portas: " + numPortas);
    }
}

class Moto extends Veiculo {
    private final String tipo;

    public Moto(String marca, int ano, String tipo) {
        super(marca, ano, "Moto");
        this.tipo = tipo;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Tipo: " + tipo);
    }
}

public class tiposVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        do {
            System.out.println("Escolha o tipo de veículo que deseja criar:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\nCriando um Carro:");
                System.out.print("Marca: ");
                String marcaCarro = scanner.nextLine();
                System.out.print("Ano: ");
                int anoCarro = scanner.nextInt();
                System.out.print("Número de portas: ");

                int numPortas = scanner.nextInt();
                scanner.nextLine();

                System.out.print("\n");

                veiculos.add(new Carro(marcaCarro, anoCarro, numPortas));
            } else if (opcao == 2) {
                System.out.println("\nCriando uma Moto:");
                System.out.print("Marca: ");
                String marcaMoto = scanner.nextLine();
                System.out.print("Ano: ");
                int anoMoto = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo: ");
                String tipoMoto = scanner.nextLine();

                System.out.print("\n");

                veiculos.add(new Moto(marcaMoto, anoMoto, tipoMoto));
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (true);

        System.out.println("\nVeículos criados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.apresentar();
            System.out.println();
        }

        scanner.close();
    }
}
