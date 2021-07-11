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
        int capacity = 1000000;
        MyArrayList<Integer> bigArray = new MyArrayList<>(capacity);
        for (int i = 0; i < capacity ; i++) {
            bigArray.add(random.nextInt((int)Math.pow(2,31)-1));
        }
        System.out.println(bigArray);

        MyArrayList<Integer> copyArray1 = new MyArrayList(capacity);
        copyArray1.copy(bigArray);


        MyArrayList<Integer> copyArray2 = new MyArrayList(capacity);
        copyArray2.copy(bigArray);


        MyArrayList<Integer> copyArray3 = new MyArrayList(capacity);
        copyArray3.copy(bigArray);

        MyArrayList<Integer> copyArray4 = new MyArrayList(capacity);
        copyArray4.copy(bigArray);

        long startQuickSort = System.currentTimeMillis();
        copyArray4.quickSort(0, copyArray4.size()-1);
        long endQuickSort = System.currentTimeMillis();
        System.out.println("QuickSort time = " + (endQuickSort-startQuickSort));

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



        System.out.println("********* Recursion sorting *********");

        MySortedArrayList<Integer> mySortedArrayList = new MySortedArrayList();
        mySortedArrayList.add(111);
        mySortedArrayList.add(25);
        mySortedArrayList.add(10);
        mySortedArrayList.add(64);
        mySortedArrayList.add(348);
        for (int i = 0; i <mySortedArrayList.size(); i++){
            System.out.println(mySortedArrayList.get(i));
        }
        int num =64;
        System.out.println("Find number = " + num);
        System.out.println("Index " + num + " = " +
                mySortedArrayList.binaryRecursionSearch(num, 0, mySortedArrayList.size()));

    }
}
