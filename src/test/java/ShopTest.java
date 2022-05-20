import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import products.accessories.SheetMusic;
import products.instruments.Cello;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertSame;
import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop musicStore;
    SheetMusic sheetMusic;
    Cello cello;

    @Before
    public void before(){
        musicStore = new Shop();
        sheetMusic = new SheetMusic(20, 16, "Movie soundtracks for Cello", "Top Movie Songs for Cello");
        cello = new Cello(400.00, 300.50, "Electric Cello", "Yamaha - Silent Cello");
    }

    @Test
    public void canAddItemsToStock(){
        musicStore.addStock(sheetMusic);
        musicStore.addStock(cello);
        assertEquals(2, musicStore.numberOfItemsInStock());
        assertEquals(cello, musicStore.stockList().get(1));
    }

    @Test
    public void canRemoveItemFromStock(){
        musicStore.addStock(sheetMusic);
        musicStore.addStock(cello);
        musicStore.removeStock(sheetMusic);
        assertEquals(1, musicStore.numberOfItemsInStock());
        assertEquals(cello, musicStore.stockList().get(0));
    }

    @Test
    public void canGetListOfStock(){
        musicStore.addStock(cello);
        musicStore.addStock(sheetMusic);
        assertEquals(new ArrayList<ISell>(Arrays.asList(cello, sheetMusic)), musicStore.stockList());
    }
}
