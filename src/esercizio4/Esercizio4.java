package esercizio4;

public class Esercizio4 {
    public static String contoAllaRovescia(int num) {
        String risultato = "";
        for (int i = num; i >= 0; i--) {
            risultato += i;
            if (i > 0) {
                risultato += ",";
            }
        }
        return risultato;
    }
}
