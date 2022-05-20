import org.junit.Before;
import org.junit.Test;
import products.instruments.Piano;
import types.InstrumentType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    public Piano piano;

    @Before
    public void before(){
        piano = new Piano(3000, 1400, "Digital home piano, polished Ebony", "Digital home piano, polished Ebony");
    }

    @Test
    public void hasAttributes(){
        assertEquals(3000, piano.getSalePrice(), 0.0);
            assertEquals(1400, piano.getCost(), 0.0);
        assertEquals("Digital home piano, polished Ebony", piano.getDescription());
        assertEquals("Digital home piano, polished Ebony", piano.getName());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARDS, piano.getType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1600, piano.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("pling, pling, dun, dun", piano.play());
    }
}
