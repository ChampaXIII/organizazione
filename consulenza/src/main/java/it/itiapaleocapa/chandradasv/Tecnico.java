package it.itiapaleocapa.chandradasv;

public class Tecnico extends Personale{
    private String specializzazione;
    private boolean ie;
    public Tecnico(int codice, String cognme, String nome, boolean dv, String sp) {
        super(codice, cognme, nome);
        this.specializzazione=sp;
        this.ie=dv;
    }

    public Tecnico(){
        super();
    }

    public String getSpecializzazione() {
        return this.specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public boolean isIe() {
        return this.ie;
    }

    public boolean getIe() {
        return this.ie;
    }

    public void setIe(boolean ie) {
        this.ie = ie;
    }

    
}
