/*
Autor: Stefan Neubauer
Erstellt am 26.10.2020

Beschreibung:
CalculationPI aus Fehlern lernen und diese ausbessern,
bei mir war es die Ausgabe und die Generalization hat gefehlt.

Dann noch etwas erweitern, und zwar sortieren.
 */


import java.math.BigDecimal;

public abstract class CalculateAll {

    final static double FINALPI = Math.PI;
    public static double nenner, zaehler, pi, basis; // Generalization



    public abstract double calculate();
    public abstract String toString();
    public abstract String getName();



    // Mit diesem Konstrukt kann man den Betrag bekommen und mit BigDecimal eine Atomgenaue Ausgabe
    public BigDecimal getDifferenz(){ return (BigDecimal.valueOf(FINALPI-calculate()).abs()); }

}
