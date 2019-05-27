import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    public Printer printer;

    @Before
    public void setup(){
        printer = new Printer(100,100);
    }

    @Test
    public void hasToner(){
        assertEquals(100,printer.getToner());
    }

    @Test
    public void hasPages(){
        assertEquals(100,printer.getPages());
    }

    @Test
    public void testPrint(){
        printer.print(10,5);
        assertEquals(50,printer.getPages());
    }

    @Test
    public void testTonerError(){
        Printer printer2 = new Printer(100,20);
        printer2.print(10,5);
        assertEquals(0,printer2.getToner());
        assertEquals(80,printer2.getPages());
    }


}
