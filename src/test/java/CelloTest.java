import org.junit.Before;
import org.junit.Test;
import products.instruments.Cello;
import types.InstrumentType;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    public Cello cello;

    @Before
    public void before(){
        cello = new Cello(400.00, 300.50, "Electric Cello", "Yamaha - Silent Cello");
    }
    @Test
    public void hasAttributes(){
        assertEquals(400.00, cello.getSalePrice(), 0.0);
        assertEquals(300.50, cello.getCost(), 0.0);
        assertEquals("Electric Cello", cello.getDescription());
        assertEquals("Yamaha - Silent Cello", cello.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRINGS, cello.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(99.50, cello.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Tango from Moulin Rouge", cello.play());
    }
}
