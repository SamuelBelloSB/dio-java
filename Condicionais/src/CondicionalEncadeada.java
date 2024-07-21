import java.util.Scanner;
import java.util.Locale;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.printf("Digite o valor da primeira nota:");
        double notaUm = sc.nextDouble();
        System.out.printf("\nDigite o valor da segunda nota:");
        double notaDois = sc.nextDouble();
        System.out.printf("\nDigite o valor da terceira nota:");
        double notaTres = sc.nextDouble();

        sc.close();
        double media = (notaUm+notaDois+notaTres)/3;
        if (media >= 6 )
            System.out.printf("A média final é: %.2f. APROVADO", media);
        else if (media < 6 && media >=4)
            System.out.printf("A média final é: %.2f. RECUPERAÇÃO", media);
        else
            System.out.printf("A média final é: %.2f. REPROVADO", media);
        
    }
}
