package products.instruments;

import products.Instrument;
import types.InstrumentType;

public class Trumpet extends Instrument {

    public Trumpet(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, description, InstrumentType.BRASS, name);
    }

    public String play(){
        return "brrrump";
    }
}
