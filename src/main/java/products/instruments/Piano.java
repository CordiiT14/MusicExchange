package products.instruments;

import products.Instrument;
import types.InstrumentType;

public class Piano extends Instrument {

    public Piano(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, description, InstrumentType.KEYBOARDS, name);
    }

    public String play(){
        return "pling, pling, dun, dun";
    }
}
