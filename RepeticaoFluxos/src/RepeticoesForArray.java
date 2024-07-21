public class RepeticoesForArray {
    public static void main(String[] args) {
        String alunos [] = {"Sam", "Caio", "Alex", "Julia", "Pedro"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("Nome do aluno: "+alunos[x]);
        }

        //For each - forma abreviada
        System.out.println("\nUsando for each:");
        for (String aluno : alunos) {
            System.out.println("Nome do aluno: "+aluno);
        }
    }
}
