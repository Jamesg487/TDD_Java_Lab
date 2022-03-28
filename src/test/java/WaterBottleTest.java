import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void beforeEach(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkMethod(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyMethod(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillMethod(){
        assertEquals(100, waterBottle.fill());
    }
}
