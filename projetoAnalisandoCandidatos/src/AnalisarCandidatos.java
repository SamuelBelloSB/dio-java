import java.util.Locale;
import java.util.Scanner;

public class AnalisarCandidatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá candidato, digite o valor de salário pretentido:");
        int salario = sc.nextInt();

        if (salario < 2000) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salario == 2000) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }
}