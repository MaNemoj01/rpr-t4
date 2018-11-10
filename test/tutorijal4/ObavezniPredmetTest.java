package tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObavezniPredmetTest {

    @Test
    void ispisiSpisakStudenta() {
        Student studentX = new Student("James","Bond",1007);
        ObavezniPredmet predmet = new ObavezniPredmet("Razvoj Programskih Rjesenja", 5);
        predmet.upisiStudenta(studentX);
        assertEquals("1. James Bond (1007)\n",predmet.ispisiSpisakStudenta());
    }

}