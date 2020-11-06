/*
Autor: Stefan Neubauer
Erstellt am 26.10.2020

Beschreibung:
CalculationPI aus Fehlern lernen und diese ausbessern,
bei mir war es die Ausgabe und die Generalization hat gefehlt.

Dann noch etwas erweitern, und zwar sortieren.
 */

import java.math.BigDecimal;

public class CalculateEuler extends CalculateAll {
    String name="Euler";

    @Override
    public double calculate(){
        nenner=1; pi = 0;

        // Algorithmus Euler Formel
        for (int i = 0; i <basis ; i++) { pi = pi + 1/(nenner*nenner); nenner+= 2; }
        return Math.sqrt(pi*8);
    }

    @Override
    public String toString(){


        return "Formel von Euler: "+calculate()+".\n";

    }

    public String getName(){ return name; }

}
