import java.time.LocalDate;
import java.util.ArrayList;

public class Progetto {
    private ArrayList<Dirigente> dir;
    private ArrayList<Funzionario> fun;
    private ArrayList<Tecnico> tec ;
    private int costoOrTot;

    public Progetto(ArrayList<Dirigente> dir, ArrayList<Funzionario> fun, ArrayList<Tecnico> tec, int costoOrTot) {
        this.dir = dir;
        this.fun = fun;
        this.tec = tec;
        this.costoOrTot = costoOrTot;
    }

    public ArrayList<Dirigente> getDir() {
        return this.dir;
    }

    public void setDir(ArrayList<Dirigente> dir) {
        this.dir = dir;
    }

    public ArrayList<Funzionario> getFun() {
        return this.fun;
    }

    public void setFun(ArrayList<Funzionario> fun) {
        this.fun = fun;
    }

    public ArrayList<Tecnico> getTec() {
        return this.tec;
    }

    public void setTec(ArrayList<Tecnico> tec) {
        this.tec = tec;
    }

    public int getCostoTot() {
        return this.costoOrTot;
    }

    public void setCostoTot(int costoOrTot) {
        this.costoOrTot = costoOrTot;
    }

    public void aggiungiDirigente (Dirigente i){
        dir.add(i);
        costoOrTot+=100;
    }
    public void aggiungiFunzionario (Funzionario i){
        fun.add(i);
        LocalDate confronto=LocalDate.now();
        if (confronto.getYear()-i.getAssunzione().getYear()<10){
            costoOrTot+=70;
        }
        else if (confronto.getYear()-i.getAssunzione().getYear()>10){
            costoOrTot+=80;
        }
    }
    public void aggiungiTecnico (Tecnico i){
        tec.add(i);
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
