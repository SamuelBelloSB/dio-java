public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? "+ smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? "+ smartTv.volume);
    }
}
