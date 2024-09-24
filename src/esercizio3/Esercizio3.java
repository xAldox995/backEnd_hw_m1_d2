package esercizio3;

public class Esercizio3 {
    public static String suddivisioneStringa (String text) {
        int i = 0;
        String result = "";

        while (i < text.length()) {
            result += text.charAt(i);
            if (i < text.length() - 1) {
                result += ",";
            }
            i ++;
        }
return result;
    }
}
