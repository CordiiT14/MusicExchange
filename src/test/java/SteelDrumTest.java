import org.junit.Before;
import org.junit.Test;
import products.instruments.SteelDrum;
import types.InstrumentType;

import static org.junit.Assert.assertEquals;

public class SteelDrumTest {

    SteelDrum steelDrum;

    @Before
    public void before(){
        steelDrum = new SteelDrum(900, 850, "Handpan", "PanAmor Handpan");
    }

    @Test
    public void hasAttributes(){
        assertEquals(900.00, steelDrum.getSalePrice(), 0.0);
        assertEquals(850, steelDrum.getCost(), 0.0);
        assertEquals("Handpan", steelDrum.getDescription());
        assertEquals("PanAmor Handpan", steelDrum.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, steelDrum.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(50, steelDrum.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("ping pang ding dang", steelDrum.play());
    }
}
