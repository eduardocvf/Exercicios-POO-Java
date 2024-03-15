import java.util.Scanner;

class FormaDePagamento {
    void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico no valor de $" + valor);
    }
}

class CartaoCredito extends FormaDePagamento {
    @Override
    void processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão de crédito no valor de $" + valor+".");
    }
}

class PayPal extends FormaDePagamento {
    @Override
    void processarPagamento(double valor) {
        System.out.println("Processando pagamento com PayPal no valor de $" + valor +".");
    }
}

public class sistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Selecione a forma de pagamento:");
            System.out.println("1. Cartão de Crédito");
            System.out.println("2. PayPal");
            opcao = scanner.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Por favor, selecione 1 ou 2.");
            }
        } while (opcao != 1 && opcao != 2);

        System.out.println("Digite o valor do pagamento:");
        String valorString = scanner.next();
        valorString = valorString.replace(',', '.');
        double valorPagamento = Double.parseDouble(valorString);
        scanner.close();

        FormaDePagamento formaPagamento;

        if (opcao == 1) {
            formaPagamento = new CartaoCredito();
        } else {
            formaPagamento = new PayPal();
        }

        formaPagamento.processarPagamento(valorPagamento);
        System.out.println("Pagamento efetuado, obrigado!");
    }
}
