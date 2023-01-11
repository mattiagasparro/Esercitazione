package org.example;

import java.util.ArrayList;

public class Calendario {
    private String nome;
    private String descrizione;
    private ArrayList<Evento> eventi;

    public Calendario() {
        eventi = new ArrayList<Evento>();
    }

    public ArrayList<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(ArrayList<Evento> eventi) {
        this.eventi = eventi;
    }

    public Calendario(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        eventi = new ArrayList<Evento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void addEvento(Evento evento) {
        eventi.add(evento);
    }

    public void removeEvento(String nome) {
        for (Evento evento : eventi) {
            if (evento.getNome().equals(nome)) {
                eventi.remove(evento);
                break;
            }
        }
    }

    public void visualizzaEventi() {
        if (eventi.isEmpty()) {
            System.out.println("Nessun evento presente.");
        } else {
            for (Evento evento : eventi) {
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Descrizione: " + evento.getDescrizione());
                System.out.println("Data: " + evento.getGiorno() + "/" + evento.getMese() + "/" + evento.getAnno());
                System.out.println();
            }
        }
    }

}

