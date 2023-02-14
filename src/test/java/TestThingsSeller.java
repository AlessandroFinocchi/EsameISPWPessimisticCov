import org.example.ThingsSeller;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestThingsSeller
{
    @Test
    public void TestSellForchetta(){
        ThingsSeller ts = new ThingsSeller();
        assertEquals(ts.getActualMoney(), ts.sellSomething("forchetta"), 0);
    }

    @Test
    public void TestSellNothing(){
        ThingsSeller ts = new ThingsSeller();
        int x = ts.getActualMoney();
        assertEquals(0, x, 0);
    }

    @Test
    public void TestSellSomething(){
        ThingsSeller ts = new ThingsSeller();
        ts.sellSomething("forchetta");
        int x = ts.sellSomething("computer");
        assertEquals(501, x, 0);
    }
}
