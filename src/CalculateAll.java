/*
Autor: Stefan Neubauer
Erstellt am 26.10.2020

Beschreibung:
CalculationPI aus Fehlern lernen und diese ausbessern,
bei mir war es die Ausgabe und die Generalization hat gefehlt.

Dann noch etwas erweitern, und zwar sortieren.
 */


public abstract class CalculateAll {

    public static double nenner, zaehler, pi; // Generalization
    public static int basis;

    public abstract double calculate();
    public abstract String toString();

}
