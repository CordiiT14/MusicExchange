package products.accessories;

import products.instruments.Accessories;
import types.AccessoryType;

public class Case extends Accessories {

    public Case(double salePrice, double cost, AccessoryType type, String description, String name) {
        super(salePrice, cost, type, description, name);
    }
}
