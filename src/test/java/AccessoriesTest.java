import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.accessories.Case;
import products.accessories.DrumStick;
import products.accessories.SheetMusic;
import products.accessories.Strings;
import products.instruments.Accessories;
import types.AccessoryType;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessories accessory;
    Case carryCase;
    Strings string;
    DrumStick drumStick;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        accessory = new Accessories(20, 14, AccessoryType.STRING_ACCESSORIES, "n/a", "Guitar Pick");
        carryCase = new Case(80, 40, AccessoryType.BRASS_ACCESSORIES, "felt lined tuba bag", "Tuba Bag");
        string = new Strings(19.50, 12, "1st/A Gut String", "Aquilla Baroque Cello");
        drumStick = new DrumStick(9.90, 5.50, "Snare Sticks", "ChopMasters");
        sheetMusic = new SheetMusic(20, 16, "Movie soundtracks for Cello", "Top Movie Songs for Cello");
    }

    @Test
    public void hasSalePrice(){
        assertEquals(20, accessory.getSalePrice(),0.0);
        assertEquals(80, carryCase.getSalePrice(),0.0);
        assertEquals(19.50, string.getSalePrice(),0.0);
        assertEquals(9.90, drumStick.getSalePrice(),0.0);
        assertEquals(20, sheetMusic.getSalePrice(),0.0);
    }

    @Test
    public void hasCostPrice(){
        assertEquals(14, accessory.getCost(),0.0);
        assertEquals(40, carryCase.getCost(),0.0);
        assertEquals(12, string.getCost(),0.0);
        assertEquals(5.50, drumStick.getCost(),0.0);
        assertEquals(16, sheetMusic.getCost(),0.0);
    }

    @Test
    public void hasDescription(){
        Assert.assertNotNull(accessory.getDescription());
        Assert.assertNotNull(carryCase.getDescription());
        Assert.assertNotNull(string.getDescription());
        Assert.assertNotNull(drumStick.getDescription());
        Assert.assertNotNull(sheetMusic.getDescription());
    }

    @Test
    public void hasName(){
        Assert.assertNotNull(accessory.getName());
        Assert.assertNotNull(carryCase.getName());
        Assert.assertNotNull(string.getName());
        Assert.assertNotNull(drumStick.getName());
        Assert.assertNotNull(sheetMusic.getName());
    }

    @Test
    public void hasType(){
        assertEquals(AccessoryType.SHEET_MUSIC, sheetMusic.getType());
        assertEquals(AccessoryType.BRASS_ACCESSORIES, carryCase.getType());
        assertEquals(AccessoryType.PERCUSSION_ACCESSORIES, drumStick.getType());
        assertEquals(AccessoryType.STRING_ACCESSORIES, string.getType());
        assertEquals(AccessoryType.STRING_ACCESSORIES, accessory.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals( 6,accessory.calculateMarkup(), 0.0);
        assertEquals(40, carryCase.calculateMarkup(), 0.0);
        assertEquals(7.50, string.calculateMarkup(), 0.0);
        assertEquals(4.40, drumStick.calculateMarkup(), 0.0);
        assertEquals(4, sheetMusic.calculateMarkup(), 0.0);
    }
}
