package esercizio1;

public class Esercizio1 {
    public static boolean stringaPariDispari (String input) {
        return input.length() % 2 == 0;
    }

    public static boolean annoBisestile (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0){
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
