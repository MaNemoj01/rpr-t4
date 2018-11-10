package tutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void toStringStudent() {
        Student studentX = new Student("James","Bond",1007);
        String s = "James Bond (1007)";
        assertEquals(s,studentX);
    }
}