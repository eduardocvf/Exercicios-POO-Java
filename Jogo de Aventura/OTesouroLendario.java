import java.util.Scanner;

public class OTesouroLendario {

    public static void selva(Scanner scanner) {
        System.out.println("Você está diante de uma selva densa e impenetrável.");
        System.out.println(" ");
        System.out.print("Deseja entrar na selva? (sim/não): ");
        String escolha = scanner.nextLine();
        if (escolha.equalsIgnoreCase("sim")) {
            System.out.println(" ");
            System.out.println("Você decide entrar na selva.");
            System.out.println("Enquanto atravessa a selva, você encontra uma passagem bloqueada por vegetação densa.");
            System.out.print("Deseja tentar cortar a vegetação ou procurar um caminho alternativo? (cortar/procurar): ");
            String acao = scanner.nextLine();
            if (acao.equalsIgnoreCase("cortar")) {
                System.out.println(" ");
                System.out.println("Você decide cortar a vegetação.");
                System.out.println("Depois de muito esforço, você consegue abrir caminho e continua sua jornada.");
            } else {
                System.out.println("Você decide procurar um caminho alternativo.");
                System.out.println("Você encontra um caminho contornando a vegetação e continua sua jornada.");
            }
        } else {
            System.out.println("Você decide voltar para casa e desiste da busca pelo tesouro.");
            System.exit(0);
        }
    }

    public static void ponte(Scanner scanner) {
        System.out.println("Você chega a uma ponte instável.");
        System.out.print("Deseja cruzar a ponte rapidamente ou procurar um caminho alternativo? (rápido/alternativo): ");
        String escolha = scanner.nextLine();
        if (escolha.equalsIgnoreCase("rápido")) {
            System.out.println(" ");
            System.out.println("Você decide cruzar a ponte rapidamente.");
            System.out.println("Enquanto atravessa a ponte, você sente ela começar a balançar perigosamente.");
            System.out.print("Deseja continuar atravessando ou voltar atrás? (atravessar/voltar): ");
            String acao = scanner.nextLine();
            if (acao.equalsIgnoreCase("atravessar")) {
                System.out.println(" ");
                System.out.println("Você decide continuar atravessando.");
                System.out.println("Com passos firmes e rápidos, você consegue chegar ao outro lado da ponte.");
            } else {
                System.out.println("Você decide voltar atrás.");
                System.out.println("Você retorna em segurança e procura por um caminho alternativo.");
            }
        } else {
            System.out.println("Você decide procurar um caminho alternativo.");
        }
    }

    public static void caverna(Scanner scanner) {
        System.out.println("Você chega a uma caverna escura.");
        System.out.print("Deseja entrar na caverna? (sim/não): ");
        String escolha = scanner.nextLine();
        if (escolha.equalsIgnoreCase("sim")) {
            System.out.println(" ");
            System.out.println("Você decide entrar na caverna.");
            System.out.println("Dentro da caverna, você se depara com um enorme monstro!");
            System.out.print("Deseja lutar contra o monstro? (sim/não): ");
            String luta = scanner.nextLine();
            if (luta.equalsIgnoreCase("sim")) {
                System.out.println(" ");
                System.out.println("Você entra em uma batalha com o monstro!");
                System.out.println("Você ataca ele com vários golpes corporais, mas não fazem efeito.");
                System.out.println("Então você ataca ele com seu Kamehamehaaaaaaaaa!!");
                System.out.println("Após uma árdua batalha, você derrota o monstro e continua sua jornada.");
            } else {
                System.out.println("Você decide não enfrentar o monstro e retorna à entrada da caverna.");
            }
        } else {
            System.out.println("Você decide voltar para trás e desiste da busca pelo tesouro.");
            System.exit(0);
        }
    }

    public static void finalDesafio(Scanner scanner) {
        System.out.println("Você chegou ao tesouro!");
        System.out.println("Para conseguir abrir o tesouro, terás que responder apenas uma pergunta.");
        System.out.println("Quantos oceanos existem no mundo?");
        System.out.print("Sua resposta: ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("cinco") || resposta.equals("5")){
            System.out.println("Parabéns! Você respondeu corretamente e reivindicou o tesouro!");
        } else {
            System.out.println("Oops! Sua resposta está incorreta! Você não consegue reivindicar o tesouro.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nVocê é um explorador em busca de um tesouro lendário em uma ilha misteriosa.");
            System.out.println("Você precisa enfrentar diversos desafios para alcançar o tesouro.");

            selva(scanner);
            ponte(scanner);
            caverna(scanner);
            finalDesafio(scanner);

            System.out.print("\nDeseja jogar novamente? (sim/não): ");
            String jogarNovamente = scanner.nextLine();
            if (!jogarNovamente.equalsIgnoreCase("sim")) {
                System.out.println("\nObrigado por jogar!");
                break;
            }
        }
    }
}
