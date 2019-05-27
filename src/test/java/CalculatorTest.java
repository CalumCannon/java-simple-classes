import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(2,calculator.addNums(1,1));
    }

    @Test
    public void testSubtract(){
        assertEquals(90,calculator.subtract(100,10));
    }

    @Test
    public void testMultiply(){
        assertEquals(30,calculator.multiply(6,5));
    }

    @Test
    public void testDivide(){
        assertEquals(10,calculator.divide(100,10), 0.01);
    }


}
