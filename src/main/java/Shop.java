import behaviours.ISell;

import java.util.ArrayList;

public class Shop{

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addStock(ISell newItem){
        this.stock.add(newItem);
    }

    public ISell removeStock(ISell removeItem){
        int index = this.stock.indexOf(removeItem);
        return this.stock.remove(index);
    }

    public int numberOfItemsInStock(){
        return this.stock.size();
    }

    public ArrayList<ISell> stockList(){
        return this.stock;
    }
}
