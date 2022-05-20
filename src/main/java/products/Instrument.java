package products;

import behaviours.IPlay;
import products.Product;
import types.InstrumentType;

public abstract class Instrument extends Product implements IPlay {

    private InstrumentType type;
    private String name;

    public Instrument(double salePrice, double cost, String description, InstrumentType type, String name) {
        super(salePrice, cost, description);
        this.type = type;
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
