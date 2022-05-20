package products.instruments;

import behaviours.ISell;
import products.Product;
import types.AccessoryType;

public class Accessories extends Product{

    private AccessoryType type;
    private String name;

    public Accessories(double salePrice, double cost, AccessoryType type, String description, String name) {
        super(salePrice, cost, description);
        this.type = type;
        this.name = name;
    }

    public AccessoryType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
