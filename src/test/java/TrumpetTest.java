import org.junit.Before;
import org.junit.Test;
import products.instruments.Trumpet;
import types.InstrumentType;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    public Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(230.00, 140.00, "Bb Trumpet", "Elkhart 100TR Trumpet");
    }

    @Test
    public void hasAttributes(){
        assertEquals(230.00, trumpet.getSalePrice(), 0.0);
        assertEquals(140.00, trumpet.getCost(), 0.0);
        assertEquals("Bb Trumpet", trumpet.getDescription());
        assertEquals("Elkhart 100TR Trumpet", trumpet.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(90.00, trumpet.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("brrrump", trumpet.play());
    }
}
