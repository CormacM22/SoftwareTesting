import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

    // Test getMax method
    @Test
    public void testGetMax() {
        Student student = new Student(123456, 60, 70, 43);
        int expected = 70; 
        int actual = student.getMax();
        assertEquals(expected, actual);
    }

    // Test getMin method
    @Test
    public void testGetMin() {
        Student student = new Student(123456, 60, 70, 43);
        int expected = 43; 
        int actual = student.getMin();
        assertEquals(expected, actual);
    }

    // Test average method
    @Test
    public void testAverage() {
        Student student = new Student(123456, 60, 70, 43);
        int expected = 58; 
        int actual = student.average();
        assertEquals(expected, actual);
    }

    // Test getID method
    @Test
    public void testGetID() {
        Student student = new Student(123456, 60, 70, 43);
        int expected = 123456; 
        int actual = student.getID();
        assertEquals(expected, actual);
    }

    // Test setID method
    @Test
    public void testSetID() {
        Student student = new Student(123456, 60, 70, 43);
        student.setID(654321);
        int expected = 654321;
        int actual = student.getID();
        assertEquals(expected, actual);
    }
}
