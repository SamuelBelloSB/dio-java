public class AnatomiaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Samuel";
        String segundoNome = "Bello";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
