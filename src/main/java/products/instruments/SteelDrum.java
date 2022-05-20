package products.instruments;

import products.Instrument;
import types.InstrumentType;

public class SteelDrum extends Instrument {

    public SteelDrum(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, description, InstrumentType.PERCUSSION, name);
    }

    public String play(){
        return "ping pang ding dang";
    }
}
