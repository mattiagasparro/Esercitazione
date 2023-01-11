package org.example;

import java.time.DateTimeException;
import java.time.LocalDate;



public class Evento {
    private String nome;
    private String descrizione;
    private int giorno;
    private int mese;
    private int anno;

    public Evento() {}

    public Evento(String nome, String descrizione, int giorno, int mese, int anno) {

            LocalDate data = LocalDate.of(anno, mese, giorno);
            this.nome = nome;
            this.descrizione = descrizione;
            this.giorno = giorno;
            this.mese = mese;
            this.anno = anno;
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

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}


