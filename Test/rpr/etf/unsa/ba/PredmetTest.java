package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PredmetTest {

    Predmet predmet = new Predmet("RPR",256,70);
    Student student = new Student("Amila", "Sikalo", 17973);

    @Test
    void upisi() {
        predmet.upisi(student);
        assertEquals(1, predmet.getBrojStudenata());
    }

    @Test
    void ispisi() {
        predmet.ispisi(student);
        assertEquals(0, predmet.getBrojStudenata());
    }

    @Test
    void ispisiStudente() {
    }

    @Test
    void getNaziv() {
        assertEquals("RPR", predmet.getNaziv());
    }

    @Test
    void setNaziv() {
        predmet.setNaziv("RPR");
        assertEquals("RPR", predmet.getNaziv());
    }

    @Test
    void getSifra() {
        assertEquals(256, predmet.getSifra());
    }

    @Test
    void setSifra() {
        predmet.setSifra(2561);
        assertEquals(2561, predmet.getSifra());

    }

    @Test
    void getMaxbrstudenata() {
    }
}