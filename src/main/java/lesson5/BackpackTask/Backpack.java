package lesson5.BackpackTask;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Backpack {

    @Setter
    private double maxBackpackWeight;
    private double totalWeightItemsInBackpack;
    private double biggerTotalPriceItemsInBackpack;
    private List<Item> bestItemsSet;


    public Backpack(double maxBackpackWeight) {
        this.maxBackpackWeight = maxBackpackWeight;
    }


    private void checkSet(List<Item> items){
        if (bestItemsSet == null) {
            if (itemsTotalWeightInBackpack(items) <= maxBackpackWeight){
                bestItemsSet = items;
                biggerTotalPriceItemsInBackpack = itemsTotalPriceInBackpack(items);
                totalWeightItemsInBackpack = itemsTotalWeightInBackpack(items);
            } else {
                bestItemsSet = null;
                biggerTotalPriceItemsInBackpack = 0;
                totalWeightItemsInBackpack = 0;
            }
        } else {
            if (itemsTotalWeightInBackpack(items) <= maxBackpackWeight &&
                    itemsTotalPriceInBackpack(items) > biggerTotalPriceItemsInBackpack) {
                bestItemsSet = items;
                biggerTotalPriceItemsInBackpack = itemsTotalPriceInBackpack(items);
                totalWeightItemsInBackpack = itemsTotalWeightInBackpack(items);
            }
        }
    }


    public void constructAllItemsSets(List<Item> items){
        if (items.size()>0) {
            checkSet(items);
        }
        for (int i = 0; i < items.size(); i++){
            List<Item> set = new ArrayList<>(items);
            set.remove(i);
            constructAllItemsSets(set);
        }
    }

    private double itemsTotalWeightInBackpack(List<Item> items){
        double totalWeight = 0;
        for (Item i: items){
            totalWeight = totalWeight + i.getWeight();
        }
        return totalWeight;
    }


    private double itemsTotalPriceInBackpack(List<Item> items){
        double totalPrice = 0;
        for (Item i: items){
            totalPrice = totalPrice + i.getPrice();
        }
        return totalPrice;
    }



}