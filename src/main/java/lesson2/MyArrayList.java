package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class MyArrayList<T extends Comparable<T>> {

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Comparable[capacity];
    }



    public void add(T item) {
        if (size >= list.length){
            T[] list2 = Arrays.copyOf(list,  (size/2 + size) + 1);
            list = list2;
            System.out.println("New list = " + Arrays.toString(list));
        }
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == size){
            T[] list2 = Arrays.copyOf(list, (size/2 + size) + 1);
            list = list2;
        }

        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public void copy (MyArrayList<T> incomeList){
        if (incomeList.isEmpty()){
            throw  new NullPointerException();
        }
        for (int i = 0; i < incomeList.size(); i++) {
            list[i] = incomeList.get(i);
            size++;
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        for (int i = index; i <= size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
    }

    public boolean remove(T item) {
        int i = index(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        return list[index];
    }

    public boolean contains(T item) {
        return index(item) > -1;
    }

    public int indexOf(T item) {
        return index(item);
    }

    private int index(T item) {
        int i;
        for (i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }




    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }


    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        int iMin;
        for (int i = 0; i < size - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }

    public void insertionSort() {
        T key;
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j - 1])) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                }
            }
        }
    }

}
