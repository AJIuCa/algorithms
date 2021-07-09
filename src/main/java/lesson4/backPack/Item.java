package lesson4.backPack;

public class Item {

    private String title;
    private double price;
    private double weight;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public Item(String title, double price, double weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }
}
