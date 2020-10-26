/*
Autor: Stefan Neubauer
Erstellt am 26.10.2020

Beschreibung:
CalculationPI aus Fehlern lernen und diese ausbessern,
bei mir war es die Ausgabe und die Generalization hat gefehlt.

Dann noch etwas erweitern, und zwar sortieren.
 */

import java.math.BigDecimal;

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

        return "Leibnitzreihe: "+calculate()+".\n";
    }


}
