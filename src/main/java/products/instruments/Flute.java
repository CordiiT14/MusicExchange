package products.instruments;
import types.InstrumentType;
import products.Instrument;

public class Flute extends Instrument {

    public Flute(double salePrice, double cost, String description, String name) {
        super(salePrice, cost, description, InstrumentType.WOODWIND, name);
    }


}
