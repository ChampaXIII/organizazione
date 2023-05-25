package it.itiapaleocapa.chandradasv;

import java.time.LocalDate;
import java.util.ArrayList;

public class Progetto {
    private ArrayList<Dirigente> direttori;
    private ArrayList<Funzionario> funzionari;
    private ArrayList<Tecnico> tecnico ;
    private int costoOrTot;

    public Progetto(ArrayList<Dirigente> direttori, ArrayList<Funzionario> funzionari, ArrayList<Tecnico> tecnico, int costoOrTot) {
        this.direttori = direttori;
        this.funzionari = funzionari;
        this.tecnico = tecnico;
        this.costoOrTot = costoOrTot;
    }

    public ArrayList<Dirigente> getDir() {
        return this.direttori;
    }

    public void setDir(ArrayList<Dirigente> direttori) {
        this.direttori = direttori;
    }

    public ArrayList<Funzionario> getFun() {
        return this.funzionari;
    }

    public void setFun(ArrayList<Funzionario> funzionari) {
        this.funzionari = funzionari;
    }

    public ArrayList<Tecnico> getTec() {
        return this.tecnico;
    }

    public void setTec(ArrayList<Tecnico> tecnico) {
        this.tecnico = tecnico;
    }

    public int getCostoTot() {
        return this.costoOrTot;
    }

    public void setCostoTot(int costoOrTot) {
        this.costoOrTot = costoOrTot;
    }

    public void aggiungiDirigente (Dirigente i){
        direttori.add(i);
        costoOrTot+=100;
    }
    public void aggiungiFunzionario (Funzionario i){
        funzionari.add(i);
        LocalDate confronto=LocalDate.now();
        if (confronto.getYear()-i.getAssunzione().getYear()<10){
            costoOrTot+=70;
        }
        else if (confronto.getYear()-i.getAssunzione().getYear()>10){
            costoOrTot+=80;
        }
    }
    public void aggiungiTecnico (Tecnico i){
        tecnico.add(i);
        LocalDate confronto=LocalDate.now();
        if (i.getSpecializzazione().equals("informatica/telecomunicazioni")) {
            costoOrTot+=40;
            int annoAttuale=confronto.getYear();
            if(i.getIe()){
                while(annoAttuale!=i.getAssunzione().getYear()){
                    annoAttuale--;
                    costoOrTot+=1;
                }
            }
        }
        if (i.getSpecializzazione().equals("elettronica/automazione")) {
            costoOrTot+=50;
            int annoAttuale=confronto.getYear();
            if(i.getIe()){
                while(annoAttuale!=i.getAssunzione().getYear()){
                    annoAttuale--;
                    costoOrTot+=1;
                }
            }
        }
        
    }
}
