package lesson4.backPack;

import java.util.ArrayList;
import java.util.List;

public class BackPack {


    private List<Item> items;
    private double maxWeightBackPackParam;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BackPack(double maxWeightParam) {
        this.maxWeightBackPackParam = maxWeightParam;
    }

    public double totalPrice(){
        double totalPrice = 0;
        for ( Item i :items) {
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }

    public double totalWeight(){
        double totalWeight = 0;
        for ( Item i :items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
}
