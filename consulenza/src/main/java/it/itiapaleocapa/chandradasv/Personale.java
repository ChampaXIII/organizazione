package it.itiapaleocapa.chandradasv;
import java.time.LocalDate;

public abstract class Personale {
    private int codice;
    private String cognome;
    private String nome;
    private LocalDate assunzione;

    public Personale (int codice, String cognome, String nome){
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
    }

    public Personale(){
        this.codice = 0;
        this.cognome = null;
        this.nome = null;
    }

    public int getCodice() {
        return this.codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAssunzione() {
        return this.assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
    }

}
