package tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IzborniPredmetTest {

    @Test
    void ispisiSpisakStudenta() {
        Student studentX = new Student("James","Bond",1007);
        IzborniPredmet predmet = new IzborniPredmet("Razvoj Programskih Rjesenja", 5);
        predmet.upisiStudenta(studentX);
        assertEquals("1. James Bond (1007)",predmet.ispisiSpisakStudenta());
    }
}