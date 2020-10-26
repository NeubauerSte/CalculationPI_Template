/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

public class CalculateKellalur extends CalculateAll {

    @Override
    public double calculate() {
        pi= 3; nenner=3;

        // Algorithmus Kellalurformel
        for (int i = 0; i < basis; i++) {
            if (i % 2 == 0) { pi = pi + 4 / ((Math.pow(nenner, 3)) - nenner);
            } else { pi = pi - 4 / ((nenner * nenner * nenner) - nenner); }
            nenner += 2; }

        return pi;
    }

    @Override
    public String toString(){
        return   "Das Ergebnis mit der Kellalurformel für Pi mit der Basis "+basis+" lautet: "+calculate()+".\n";
    }


}
