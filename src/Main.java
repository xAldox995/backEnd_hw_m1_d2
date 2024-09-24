import esercizio1.Esercizio1;
import esercizio2.Esercizio2;
import esercizio3.Esercizio3;
import esercizio4.Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Esercizio 1");

        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci stringa per verificare se è pari o dispari: ");
        String testStr = in.nextLine();
        boolean resultOddOrEven = Esercizio1.stringaPariDispari(testStr);
        System.out.println(resultOddOrEven);

        System.out.print("Inserisci un anno per verificare se è bisestile :");
        int testYear = in.nextInt();
        boolean resultOfYear = Esercizio1.annoBisestile(testYear);
        System.out.println(resultOfYear);

        System.out.println("Esercizio 2");

        System.out.print("Inserisci un Numero da 0-3");
        int numUtente = in.nextInt();
        Esercizio2.stampaNumeroInLettere(numUtente);

        in.nextLine();


        System.out.println("Esercizio 3");

        String testoUtente;

        do {
            System.out.println("Inserisci una stringa (digita ':q' per uscire)");
            testoUtente = in.nextLine();
            if (!testoUtente.equals(":q")) {
                String risutato = Esercizio3.suddivisioneStringa(testoUtente);
                System.out.println(risutato);
            }
        } while (!testoUtente.equals(":q"));

        System.out.println("Esercizio 4");

        System.out.println("Inserisci un numero per il conto alla rovescia");
        int numeroTest = in.nextInt();
        String risutato = Esercizio4.contoAllaRovescia(numeroTest);
        System.out.println("Conto alla rovescia: " + risutato);
        in.close();
    }
}