import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public abstract class Personale{
    String codice;
    String nome;
    String cognome;

    Date inizioAssunzione;
    Date inizioCollaborazione;
    
    enum Position{
        INTERNO,
        ESTERNO
    }

    protected Personale(String codice, String nome, String cognome, String inizioAssunzione, String inizioCollaborazione){
        if(inizioAssunzione == null){
            this.inizioAssunzione = null;
        }else{
            try {
                DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
                this.inizioAssunzione = dateFormat.parse(inizioAssunzione);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if(inizioCollaborazione == null){
            this.inizioCollaborazione = null;
        }else{
            try {
                DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
                this.inizioCollaborazione = dateFormat.parse(inizioCollaborazione);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}