public class ListarCandidatosSelecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"SAM", "ALEX", "AMEINDA", "VITIN", "CAIO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++){
            System.out.printf("\nO candidato de n° %d é o %s.", i+1, candidatos[i]);
        }

        System.out.println("\nForma abreviada de iteração com for each:");

        for (String candidato : candidatos){
            System.out.printf("\nO candidato selecionado foi %s", candidato);
        }
    }
}
