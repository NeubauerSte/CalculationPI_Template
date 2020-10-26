/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

public class CalculateLeibnitz extends CalculateAll {

    @Override
    public double calculate(){
        nenner=1; pi=0;

        // Algorithmus Leibnitzreihe
        for (int i = 0; i < basis ; i++) {
            if (i % 2 == 0){ pi = pi + (1/nenner); } else { pi = pi - (1/nenner); }
            nenner=nenner+2; }

        return pi*4;
    }

    @Override
    public String toString(){

        return "Das Ergebnis mit der Leibnitzreihe für Pi mit der Basis "+basis+" lautet: "+calculate()+".\n";
    }


}
