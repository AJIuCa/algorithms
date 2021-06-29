package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    startApp();
    }


    public static void startApp(){

        Random random = new Random();
        int capacity = 100000;
        MyArrayList<Integer> bigArray = new MyArrayList<>(capacity );
        for (int i = 0; i < capacity ; i++) {
            bigArray.add(random.nextInt((int)Math.pow(2,31)-1));
        }
        System.out.println(bigArray);

        MyArrayList<Integer> copyArray1 = new MyArrayList(capacity);
        copyArray1.copy(bigArray);
//        System.out.println(copyArray1);

        MyArrayList<Integer> copyArray2 = new MyArrayList(capacity);
        copyArray2.copy(bigArray);
//        System.out.println(copyArray2);

        MyArrayList<Integer> copyArray3 = new MyArrayList(capacity);
        copyArray3.copy(bigArray);
//        System.out.println(copyArray3);

        long startSelectionTime = System.currentTimeMillis();
        copyArray1.selectionSort();
        long endSelectionTime = System.currentTimeMillis();
        System.out.println("Selection sort time = " + (endSelectionTime-startSelectionTime));


        long startInsertTime = System.currentTimeMillis();
        copyArray2.insertionSort();
        long endInsertTime = System.currentTimeMillis();
        System.out.println("Insert sort time = " + (endInsertTime-startInsertTime));


        long startBubbleSortTime = System.currentTimeMillis();
        copyArray3.bubbleSort();
        long endBubbleSortTime = System.currentTimeMillis();
        System.out.println("Bubble sort time = " + (endBubbleSortTime-startBubbleSortTime));

    }
}
