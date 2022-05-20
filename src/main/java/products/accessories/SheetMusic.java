package products.accessories;

import products.instruments.Accessories;
import types.AccessoryType;

public class SheetMusic extends Accessories {

    public SheetMusic(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, AccessoryType.SHEET_MUSIC, description, name);
    }
}
