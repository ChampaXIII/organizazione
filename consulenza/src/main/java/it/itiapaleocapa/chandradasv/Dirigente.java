package it.itiapaleocapa.chandradasv;

public class Dirigente extends Personale{

    public Dirigente(LocalDate assunzione, int codice, String cognome, String nome, boolean interno) {
        super(assunzione, codice, cognome, nome, interno);
        this.setTariffaOraria(100);
    }
    
}
