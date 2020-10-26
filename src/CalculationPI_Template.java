
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
        double[] ergebnisse = new double[4];

        try { // Exceptionhandling
            System.out.println("Wie oft soll multipliziert werden für PI?");
            CalculateAll.basis = sc.nextInt(); }
        catch (InputMismatchException iem){ System.out.println("Bitte eine ZAHL angeben!"); System.exit(0); }

        // Nochmal etwas überdenkt, so finde ich es besser
        allMethods = new CalculateAll[]{ new CalculateLeibnitz(), new CalculateKellalur(), new CalculateEuler(), new CalculateWallprodukt()};

        // Array mit allen Ergebnissen der Methoden
        for (int i = 0; i <allMethods.length ; i++) { ergebnisse[i] = allMethods[i].calculate(); }

        print(false); // Nicht Sortierte Ausgabe
        print(true); // Sortierte Ausgabe




    /*
    AUFGABENSTELLUNG: erstellen Sie eine Methode zum Vergleich der Algorithmen

    absteigend sortiert, d.h. das Ergebnis, das Pi am nächsten kommt, zuerst
    beachten Sie negative und positive Differenzen, arbeiten Sie mit absoluten Zahlen
    legen Sie sich eine Referenzzahl für PI als Konstante an
    versuchen Sie es möglichst einfach (Lösung mit compareTo möglich?)

    Denken Sie an eine objektorientierte Lösung!
    */

    }

    public static void compareAlgorithm(){

        final double FINALPI = Math.PI; // Von IntelliJ integriert, zum vergleich zu den Rechnungen


    }

    public static void print(boolean sort){
        if (sort){ sort();System.out.println("\n==============================SORTIERT=============================="); } // sort()
        else { System.out.println("\n==============================NICHT SORTIERT=============================="); } // kein sort()

        for (CalculateAll allMethod : allMethods) { System.out.println(allMethod.toString()); } // Ausgabe
    }

    public static void sort(){
        Arrays.sort(allMethods, new Comparator<CalculateAll>() {
            @Override
            public int compare(CalculateAll o1, CalculateAll o2) {
                return Double.compare(o1.calculate(), o2.calculate());
            }
        });
    }

}
