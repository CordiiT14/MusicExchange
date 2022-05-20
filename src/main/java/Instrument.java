public abstract class Instrument extends Product{

    private InstrumentType type;
    private String name;

    public Instrument(double salePrice, double cost, String description, InstrumentType type, String name) {
        super(salePrice, cost, description);
        this.type = getType();
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
