package products.accessories;

import products.instruments.Accessories;
import types.AccessoryType;

public class Strings extends Accessories {

    public Strings(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, AccessoryType.STRING_ACCESSORIES, description, name);
    }


}
