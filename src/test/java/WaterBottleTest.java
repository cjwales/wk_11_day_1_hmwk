import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle(100);
    }

    @Test
    public void drink() {
        assertEquals(100.0, myBottle.getVolume());
        myBottle.drink();
        assertEquals(90.0, myBottle.getVolume());
    }

    @Test
    public void empty() {
        myBottle.empty();
        assertEquals(0.0, myBottle.getVolume());
    }

    @Test
    public void fill() {
        myBottle.fill();
        assertEquals(100.0, myBottle.getVolume());
    }




}
