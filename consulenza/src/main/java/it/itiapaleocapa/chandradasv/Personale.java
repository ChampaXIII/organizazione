package it.itiapaleocapa.chandradasv;
import java.time.LocalDate;

public abstract class Personale {
    private int codice;
    private String cognome;
    private String nome;
    private LocalDate assunzione;
    private boolean interno;
    private int tariffaOraria;

    public Personale (LocalDate assunzione, int codice, String cognome, String nome, boolean interno){
        this.assunzione = assunzione;
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.interno = interno;
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

    public void setInterno(boolean o){
        this.interno = 0;
    }
    
    public boolean getInterno(){
        return interno;
    }

    public int getTariffaOraria() {
        return this.tariffaOraria;
    }

    public void setTariffaOraria(int tariffaOraria) {
        this.tariffaOraria = tariffaOraria;
    }

}
