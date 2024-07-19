import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite número da Agência!");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e o seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, numeroDaConta, saldo);

    }
}