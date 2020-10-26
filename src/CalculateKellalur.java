/*
Autor: Stefan Neubauer
Erstellt am 26.10.2020

Beschreibung:
CalculationPI aus Fehlern lernen und diese ausbessern,
bei mir war es die Ausgabe und die Generalization hat gefehlt.

Dann noch etwas erweitern, und zwar sortieren.
 */

import java.math.BigDecimal;

public class CalculateKellalur extends CalculateAll {
    double ergebnis;

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

        return   "Kellalurformel: "+calculate()+".\n";

    }


}
