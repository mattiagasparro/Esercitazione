package org.example;

public class Main {
    public static void main(String[] args) {
        Calcolatrice miaCalcolatrice = new Calcolatrice();
        double somma = miaCalcolatrice.somma(2, 3);
        double sottrazione = miaCalcolatrice.sottrazione(4, 2);
        double divisione = miaCalcolatrice.divisione(8, 4);
        double potenza = miaCalcolatrice.potenza(2, 3);
        double media = miaCalcolatrice.media(new double[] { 2, 4, 6, 8 });
    }
}