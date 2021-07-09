package lesson5;

import lesson5.BackpackTask.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        powTest();
        backpackTask();

    }

    public static void powTest() {
        MathPow mathPow = new MathPow();
        int a = 2;
        int b = 3;
        System.out.println("Number " + a + " raised to " + b + " = " + mathPow.recPow(a,b));
        int a1 = 5;
        int b1 = -4;
        System.out.println("Number " + a1 + " raised to " + b1 + " = " + mathPow.recPow(a1,b1));
        System.out.println("NEXT TASK\n");

    }

    public static void backpackTask() {

        Item item1 = new Item("Book", 2, 3);
        Item item2 = new Item("LapTop", 40, 30);
        Item item3 = new Item("Apple", 0.3, 0.5);
        Item item4 = new Item("Toy", 15, 5);
        Item item5 = new Item("Gold", 150, 10);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        System.out.println("###### LIST OF ITEMS ######");
        for (Item it : items) {
            System.out.println("Title = " + it.getTitle() + "; Price = " + it.getPrice() +
                    "; Weight = " + it.getWeight());
        }
        System.out.println("");


        Backpack backPack = new Backpack(41);
        System.out.println("###### CARRYING CAPACITY ######");
        System.out.println(backPack.getMaxBackpackWeight());
        System.out.println("");

        backPack.constructAllItemsSets(items);
        List<Item> solution = backPack.getBestItemsSet();

        if (solution == null) {
            System.out.println("###### NO SOLUTION ######");
        } else {
            System.out.println("###### SOLUTION ######");
            for (Item i : solution) {
                System.out.println("Title = " + i.getTitle() + "; Price = " + i.getPrice() +
                        "; Weight = " + i.getWeight());
            }
            System.out.println("Best total price = " + backPack.getBiggerTotalPriceItemsInBackpack() +
                    "; Items weight in backpack = " + backPack.getTotalWeightItemsInBackpack());
        }
    }

}
