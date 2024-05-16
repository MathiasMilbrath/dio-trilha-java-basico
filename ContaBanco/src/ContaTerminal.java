import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Agencia: ");
        agencia = scanner.nextLine();
        System.out.println("Digite o seu número: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    }
}