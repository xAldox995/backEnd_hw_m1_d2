package esercizio2;

public class Esercizio2 {
    public static void stampaNumeroInLettere(int n) {

        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: numero fuori dal range 0-3.");
                break;
        }
    }
}
