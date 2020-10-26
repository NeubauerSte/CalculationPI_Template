
import java.util.InputMismatchException;
import java.util.Scanner;

 /*
    erstellt von Gerhard L.
    erstellt am 18.10.2020
    Beschreibung: berechnet die Zahl Pi mit unterschiedlichen Näherungsalgorithmen
                  zusätzlich wird dem User eine Sortierung der Ergebnisse angeboten


     - Überarbeitet von Stefan Neubauer, am 26.10.2020
     */

public class CalculationPI_Template {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try { // Exceptionhandling
            System.out.println("Wie oft soll multipliziert werden für PI?");
            CalculateAll.basis = sc.nextInt(); }
        catch (InputMismatchException iem){ System.out.println("Bitte eine ZAHL angeben!"); System.exit(0); }

        System.out.println("========================================================");
        System.out.println(new CalculateEuler().toString());
        System.out.println(new CalculateKellalur().toString());
        System.out.println(new CalculateLeibnitz().toString());
        System.out.println(new CalculateWallprodukt().toString());
        System.out.println("========================================================");
    /*
    AUFGABENSTELLUNG: erstellen Sie eine Methode zum Vergleich der Algorithmen

    absteigend sortiert, d.h. das Ergebnis, das Pi am nächsten kommt, zuerst
    beachten Sie negative und positive Differenzen, arbeiten Sie mit absoluten Zahlen
    legen Sie sich eine Referenzzahl für PI als Konstante an
    versuchen Sie es möglichst einfach (Lösung mit compareTo möglich?)

    Denken Sie an eine objektorientierte Lösung!
    */

    }
}
