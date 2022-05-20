public abstract class Product implements ISell{

    private double salePrice;
    private double cost;
    private String description;

    public Product(double salePrice, double cost, String description) {
        this.salePrice = salePrice;
        this.cost = cost;
        this.description = description;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double calculateMarkup(){
        return this.salePrice/(this.cost * 100);
    }
}
