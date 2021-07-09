package lesson5.BackpackTask;

import lombok.Getter;

@Getter
public class Item {


    private String title;
    private double price;
    private double weight;


    public Item(String title, double price, double weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }
}