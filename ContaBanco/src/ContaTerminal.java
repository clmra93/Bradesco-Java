import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite o número da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        
        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();


        System.out.print("Digite seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
