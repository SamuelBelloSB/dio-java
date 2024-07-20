import java.util.Locale;
import java.util.Scanner;

public class CondicionalSimples {

    public static void main(String[] args) {
        double saldo = 47.37;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.printf("Digite o valor que deseja retirar: ");
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.printf("Saque retirado, saldo atual: %.2f", saldo);
        }
        System.out.printf("Saque negado, saldo atual: %.2f", saldo);
    }
}