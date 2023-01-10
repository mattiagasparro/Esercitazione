package org.example;

public class Calcolatrice {

    public double somma(double a, double b) {
        return a + b;
    }


    public double sottrazione(double a, double b) {
        return a - b;
    }


    public double divisione(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Impossibile dividere per zero");
        }
        return a / b;
    }


    public double potenza(double a, int b) {
        return Math.pow(a, b);
    }


    public double media(double[] numeri) {
        double somma = 0;
        for (double numero : numeri) {
            somma += numero;
        }
        return somma / numeri.length;
    }
}
