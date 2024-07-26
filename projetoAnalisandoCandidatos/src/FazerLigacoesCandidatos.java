import java.util.Random;

public class FazerLigacoesCandidatos {
    public static void main(String[] args) {
        String [] candidatos = {"SAM", "ALEX", "AMEINDA", "VITIN", "CAIO"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas ++;
            else System.out.printf("\nCONTATO REALIZADO COM SUCESSO COM %s", candidato);
        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.printf("\nConseguimos contato com %s na %d tentativa\n", candidato, tentativasRealizadas);
        } else System.out.printf("\nNão conseguimos contato com %s, numero máximo de tentativas realizadas foram %d\n", candidato, tentativasRealizadas);
    }



    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
