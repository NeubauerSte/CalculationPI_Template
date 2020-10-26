/*
Autor: Stefan Neubauer
Erstellt am 12.10.2020

Beschreibung:
Erstes Projekt mit Github und Git Bash
--> Pi berechnen, ziemlich simpel, jedoch muss alles mit Git funktionieren.
 */

public class CalculateEuler extends CalculateAll {

    @Override
    public double calculate(){
        nenner=1; pi = 0;

        // Algorithmus Euler Formel
        for (int i = 0; i <basis ; i++) { pi = pi + 1/(nenner*nenner); nenner=nenner+2; }
        return Math.sqrt(pi*8);
    }

    @Override
    public String toString(){
        return "Das Ergebnis mit der Formel von Euler für Pi mit der Basis "+basis+" lautet: "+calculate()+".\n";
    }

}
