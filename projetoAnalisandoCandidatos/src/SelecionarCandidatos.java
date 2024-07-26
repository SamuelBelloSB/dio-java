import java.util.concurrent.ThreadLocalRandom;

public class SelecionarCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"SAM", "ALEX", "AMEINDA", "VITIN", "CAIO", "NATHAN", "SILAS"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.printf("\nO candidato %s solocitou este valor de salario %.2f", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.printf("\nO candidato %s foi selecionado para a vaga.", candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}
