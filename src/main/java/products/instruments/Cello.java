package products.instruments;

import products.Instrument;
import types.InstrumentType;

public class Cello extends Instrument {

    public Cello(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, description, InstrumentType.STRINGS, name);
    }

    public String play(){
        return "Tango from Moulin Rouge";
    }
}
