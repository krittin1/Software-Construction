package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName_ShouldReturnNameFromSuperClassPerson_WhenCall() {
        Student student = new Student("Pasit", "5910451111");
        String actual = student.getName();
        assertEquals("Pasit", actual);
    }

    @Test
    void setName_ShouldChangeName_WhenReceiveNewName() {
        Student student = new Student("Pasit", "5910451111");
        student.setName("Moss");
        assertEquals("Moss", student.getName());
    }

    @Test
    void addScore_ShouldIncreaseScore_WhenReceivePositiveNumber() {
        Student student = new Student("Pasit" , "5910451111");
        student.addScore(100);
        assertEquals(100, student.getScore());
        student.addScore(1.5);
        assertEquals(101.5, student.getScore());
    }

    @Test
    void addScore_ShouldThrowIllegalArgumentException_WhenReceiveNegativeNumber() {
        Student student = new Student("Pasit" , "5910451111");
        assertThrows(IllegalArgumentException.class,
                () -> {
                        student.addScore(-50.7);
                }
                );
    }

    @Test
    void addScore_ShouldNotIncreaseScore_WhenReceiveNegativeNumber() {
        Student student = new Student("Mickey", "6010450701");
        try {
            student.addScore(-35.9);
        } catch (IllegalArgumentException ignored) {}
        assertEquals(0, student.getScore());
        student.addScore(40.5);
        try {
            student.addScore(-32.1);
        } catch (IllegalArgumentException ignored) {}
        assertEquals(40.5, student.getScore());
    }


}