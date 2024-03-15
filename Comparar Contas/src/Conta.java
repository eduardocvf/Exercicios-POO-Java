public class Conta{
    private String titular;
    private String numeroConta;
    private double quantidade;
    public Conta (String titular, String numeroConta, double quantidade){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.quantidade = quantidade;
    }
    public String getTitular(){
        return  titular;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getQuantidade(){
        return quantidade;
    }
    public boolean temMaisDinheiro(Conta outraConta){
        return this.quantidade > outraConta.getQuantidade();
    }
    public static void main(String[]args){
        Conta conta1 = new Conta("Eduardo", "123456", 50000);
        Conta conta2 = new Conta("Catarina", "654321", 50000);

        if (conta1.temMaisDinheiro(conta2)){
            System.out.println(" ");
            System.out.println("A conta de "+ conta1.getTitular() +" "+"tem mais dinheiro.");
        } else if (conta2.temMaisDinheiro(conta1)) {
            System.out.println(" ");
            System.out.println("A conta de " + conta2.getTitular() +" "+ "tem mais dinheiro.");
        } else {
            System.out.println(" ");
            System.out.println("A conta da Catarina possui o mesmo saldo que a do Eduardo.");
        }
    }
}