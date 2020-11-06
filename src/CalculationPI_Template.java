
import java.math.BigDecimal;
import java.util.*;

 /*
    erstellt von Gerhard L.
    erstellt am 18.10.2020
    Beschreibung: berechnet die Zahl Pi mit unterschiedlichen Näherungsalgorithmen
                  zusätzlich wird dem User eine Sortierung der Ergebnisse angeboten


     - Überarbeitet von Stefan Neubauer, am 26.10.2020
     */

public class CalculationPI_Template {
    static CalculateAll[] allMethods;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        allMethods = new CalculateAll[]{new CalculateLeibnitz(), new CalculateKellalur(), new CalculateEuler(), new CalculateWallprodukt()};

        try { // Exceptionhandling
            System.out.println("Wie oft soll multipliziert werden für PI?");
            CalculateAll.basis = sc.nextInt();
        } catch (InputMismatchException iem) {
            System.out.println("Bitte eine ZAHL angeben!");
            System.exit(0);
        }

        System.out.println("Basis: " + CalculateAll.basis+".\n");

        sort(); // Hiermit werden die Ergebnisse absteigend sortiert. Jedoch nicht die Differenzen.
        print(); // Ausgabe

        String[] differenzen = new String[4];
        for (int i = 0; i <allMethods.length ; i++) { differenzen[i] = allMethods[i].getDifferenz().toPlainString() + "("+allMethods[i].getName()+")"; }
        Arrays.sort(differenzen); // Sortiert, dass zuerst das näheste ausgegeben wird.

        System.out.println("\nDIFFERENZEN ABSTEIGEND SORTIERT:");

        for(String differenz: differenzen){ System.out.println(differenz); }


    }

    public static void print() {
        for (CalculateAll allMethod : allMethods) { System.out.println(allMethod.toString()); } // Ausgabe
    }

    public static void sort() {
        // Eine neue Methode zum sortieren, die ich gefunden habe. Sie ist in nur einer Zeile erledigt! (Lambda Expression)
            Arrays.sort(allMethods, (calc1, calc2) -> Double.compare(calc2.calculate(), calc1.calculate()));

    }
}
