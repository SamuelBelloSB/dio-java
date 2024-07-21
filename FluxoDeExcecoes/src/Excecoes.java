import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade:");
        int idade = 0;
        try {
            idade = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("O campo idade deve conter um valor de numero inteiro!");
            sc.close();
            return;
        }

        System.out.println("Digite sua altura:");
        double altura = 0.0;
        try {
            altura = sc.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.println("O campo de idade deve conter um valor númerico decimal!");
            sc.close();
            return;
        }
        sc.close();
        
        System.out.printf("Olá %s %s, você tem %d anos e %.2f de altura", nome, sobrenome, idade, altura);
    }
}