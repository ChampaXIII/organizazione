package it.itiapaleocapa.chandradasv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest {
    private Progetto project;
    private ArrayList<Dirigente> dirigenti;
    private ArrayList<Funzionario> funzionari;
    private ArrayList<Tecnico> tecnici;

    @BeforeEach
    void setUp() {
        dirigenti = new ArrayList<>();
        funzionari = new ArrayList<>();
        tecnici = new ArrayList<>();
        project = new Progetto(dirigenti, funzionari, tecnici, 0);
    }

    @Test
    void testGetDir() {
        assertEquals(dirigenti, project.getDir());
    }

    @Test
    void testSetDir() {
        ArrayList<Dirigente> newDirigenti = new ArrayList<>();
        newDirigenti.add(new Dirigente());
        project.setDir(newDirigenti);
        assertEquals(newDirigenti, project.getDir());
    }

    @Test
    void testGetFun() {
        assertEquals(funzionari, project.getFun());
    }

    @Test
    void testSetFun() {
        ArrayList<Funzionario> newFunzionari = new ArrayList<>();
        newFunzionari.add(new Funzionario());
        project.setFun(newFunzionari);
        assertEquals(newFunzionari, project.getFun());
    }

    @Test
    void testGetTec() {
        assertEquals(tecnici, project.getTec());
    }

    @Test
    void testSetTec() {
        ArrayList<Tecnico> newTecnici = new ArrayList<>();
        newTecnici.add(new Tecnico());
        project.setTec(newTecnici);
        assertEquals(newTecnici, project.getTec());
    }

    @Test
    void testGetCostoTot() {
        assertEquals(0, project.getCostoTot());
    }

    @Test
    void testSetCostoTot() {
        project.setCostoTot(100);
        assertEquals(100, project.getCostoTot());
    }

    @Test
    void testAggiungiDirigente() {
        Dirigente newDirigente = new Dirigente();
        project.aggiungiDirigente(newDirigente);
        assertTrue(project.getDir().contains(newDirigente));
        assertEquals(100, project.getCostoTot());
    }

    @Test
    void testAggiungiFunzionario() {
        Funzionario newFunzionario = new Funzionario();
        LocalDate assunzione = LocalDate.now().minusYears(5);
        newFunzionario.setAssunzione(assunzione);
        project.aggiungiFunzionario(newFunzionario);
        assertTrue(project.getFun().contains(newFunzionario));
        assertEquals(70, project.getCostoTot());
    }

    @Test
    void testAggiungiTecnico() {
        Tecnico newTecnico = new Tecnico();
        LocalDate assunzione = LocalDate.now().minusYears(5);
        newTecnico.setAssunzione(assunzione);
        newTecnico.setSpecializzazione("informatica/telecomunicazioni");
        project.aggiungiTecnico(newTecnico);
        assertTrue(project.getTec().contains(newTecnico));
        assertEquals(40, project.getCostoTot());
    }
}
