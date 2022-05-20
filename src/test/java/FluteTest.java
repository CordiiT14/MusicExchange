import products.instruments.Flute;
import org.junit.Before;
import org.junit.Test;
import types.InstrumentType;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    public Flute flute;

    @Before
    public void before(){
        flute = new Flute(120.00, 60.00, "n/a", "Recorder");
    }

    @Test
    public void hasAttributes(){
        assertEquals(120.00, flute.getSalePrice(), 0.0);
        assertEquals(60.00, flute.getCost(), 0.0);
        assertEquals("n/a", flute.getDescription());
        assertEquals("Recorder", flute.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(60.00, flute.calculateMarkup(), 0.0);
    }
}
