package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student("Amila","Sikalo",17973);

    @Test
    void testToString() {
        assertEquals("Sikalo Amila (17973)", student.toString());
    }

    @Test
    void getIme() {
        assertEquals("Amila", student.getIme());
    }

    @Test
    void setIme() {
        student.setIme("Amila1");
        assertEquals("Amila1", student.getIme());
    }

    @Test
    void getPrezime() {
        assertEquals("Sikalo", student.getPrezime());
    }

    @Test
    void setPrezime() {
        student.setPrezime("Sikalo1");
        assertEquals("Sikalo1", student.getPrezime());
    }

    @Test
    void getBrindeksa() {
        assertEquals(17973, student.getBrindeksa());
    }

    @Test
    void setBrindeksa() {
        student.setBrindeksa(179731);
        assertEquals(179731, student.getBrindeksa());
    }
}