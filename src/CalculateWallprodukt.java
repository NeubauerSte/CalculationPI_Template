/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

public class CalculateWallprodukt extends CalculateAll {

    @Override
    public double calculate() {
        nenner=1; zaehler=2; pi=2;

        //Algorithmus für das wallische Produkt
        for (int i = 0; i <basis ; i++) {
            if (i%2 == 0){ nenner+= 2; } else { zaehler += 2; }
            pi *=  (zaehler/nenner); }

        return pi*2;
    }

    @Override
    public String toString(){

        return "Das Ergebnis mit dem Wallisschen Produkt für Pi mit der Basis "+basis+" lautet: "+calculate()+".";

    }
}
