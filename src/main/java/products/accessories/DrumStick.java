package products.accessories;

import products.instruments.Accessories;
import types.AccessoryType;

public class DrumStick extends Accessories {

    public DrumStick(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, AccessoryType.PERCUSSION_ACCESSORIES, description, name);
    }
}
