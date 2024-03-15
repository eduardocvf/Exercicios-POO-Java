import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem-Vindo ao Tabuadex");
        System.out.println("Responda corretamente aos problemas de tabuada para ganhar pontos");

        int pontos= 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){
            int multiplicador = random.nextInt(9) +1;
            int numero = 7;
            System.out.println("Quanto é " + numero + "x" + multiplicador + "?");
            int resposta = scanner.nextInt();

            if (resposta == numero * multiplicador){
                pontos += 10;
                System.out.println("Correto você ganhou 10 pontos");
            }
            else {
                System.out.println("Incorreto! A resposta correta é :" + (numero * multiplicador) + ".");

            }

            System.out.println("Total de pontos: " + pontos);
            System.out.println("Deseja continuar ? (s/n): ");
            String continuar = scanner.next();

            if(continuar.equals("n")){
                break;
            }
        }
        System.out.println("O Jogo acabou. Total de pontos: " + pontos);
    }
}