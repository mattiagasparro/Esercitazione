package org.example;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Applicazione avviata");
        Scanner scanner = new Scanner(System.in);
        Calendario calendario = new Calendario();

        while (true) {
            System.out.println("Seleziona un'opzione:");
            System.out.println("1. Aggiungi evento");
            System.out.println("2. Rimuovi evento");
            System.out.println("3. Visualizza eventi");
            System.out.println("4. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                System.out.println("Inserisci nome evento:");
                String nome = scanner.nextLine();
                System.out.println("Inserisci descrizione evento:");
                String descrizione = scanner.nextLine();
                System.out.println("Inserisci giorno evento:");
                int giorno = scanner.nextInt();
                System.out.println("Inserisci mese evento:");
                int mese = scanner.nextInt();
                System.out.println("Inserisci anno evento:");
                int anno = scanner.nextInt();

                Evento evento = new Evento(nome, descrizione, giorno, mese, anno);
                calendario.addEvento(evento);
                logger.debug("evento inserito");
            } else if (scelta == 2) {
                System.out.println("Inserisci nome evento da rimuovere:");
                String nome = scanner.nextLine();
                calendario.removeEvento(nome);
                logger.debug("evento rimosso");
            } else if (scelta == 3) {
                calendario.visualizzaEventi();
            } else if (scelta == 4) {
                break;
            } else {
                System.out.println("Opzione non valida. Riprova.");
            }
        }
    }
}
