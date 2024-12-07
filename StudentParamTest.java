import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StudentParamTest {

    private int ID;
    private int english;
    private int irish;
    private int maths;
    
    private int expectedMax;
    private int expectedMin;
    private int expectedAverage;

    
    public StudentParamTest(int ID, int english, int irish, int maths, int expectedMax, int expectedMin, int expectedAverage) {
        this.ID = ID;
        this.english = english;
        this.irish = irish;
        this.maths = maths;
        this.expectedMax = expectedMax;
        this.expectedMin = expectedMin;
        this.expectedAverage = expectedAverage;
    }

  
    @Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {111, 40, 10, 90, 90, 10, 47},  //Dataset 1: ID = 111, English = 40, Irish = 10, Maths = 90.
            {222, 30, 50, 40, 50, 30, 40},  // Dataset 2: ID = 222, English = 30, Irish = 50, Maths = 40
            {333, 15, 60, 55, 60, 15, 43}   // Dataset 3: ID = 333, English = 15, Irish = 60, Maths = 55
        });
    }

    @Test
    public void testGetMax() {
        Student student = new Student(ID, english, irish, maths);
        assertEquals("Expected max result for ID " + ID, expectedMax, student.getMax());
    }

    @Test
    public void testGetMin() {
        Student student = new Student(ID, english, irish, maths);
        assertEquals("Expected min result for ID " + ID, expectedMin, student.getMin());
    }

    @Test
    public void testAverage() {
        Student student = new Student(ID, english, irish, maths);
        assertEquals("Expected average result for ID " + ID, expectedAverage, student.average());
    }
}
