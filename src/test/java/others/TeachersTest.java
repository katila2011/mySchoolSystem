package others;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeachersTest {

    @org.junit.jupiter.api.Test
    void teachersPassMethod() {
        Teachers teacherobj = new Teachers();

        //assertFalse(teacherobj.TeachersPassMethod("teacher666"));
        assertTrue(teacherobj.TeachersPassMethod("teacher@HNUF"));
    }

    @org.junit.jupiter.api.Test
    void staffWriterMethod1() {
        var staffWriterMethodobj = new Teachers();
        assertAll();

    }
}