package tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void toStringStudent() {
        Student studentX = new Student("James","Bond",1007);
        assertEquals("James Bond (1007)",studentX);
    }
}