import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(100, 100);
    }

    @Test
    public void getPaper() {
        assertEquals(100, myPrinter.getPaper());
    }

    @Test
    public void canPrint() {
        myPrinter.print(2, 2);
        assertEquals(96, myPrinter.getPaper());
        assertEquals(96, myPrinter.getToner());
    }
}
