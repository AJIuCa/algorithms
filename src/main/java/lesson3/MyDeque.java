package lesson3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 5;
    private int startPosition = 0;
    private int endPosition =0;



    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        list[endPosition] = item;
        endPosition = nextIndex(endPosition);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        for (int j = size-1; j>0; j--){
            list[j]=list[j-1];
        }
//        if (startPosition==0 && endPosition == 0){
//            list[startPosition] = item;
//        } else {
//            list[startPosition] = item;
//        }

        list[startPosition] = item;
        endPosition = nextIndex(endPosition);
    }


    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[startPosition];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (endPosition == 0) {
            return list[DEFAULT_CAPACITY-1];
        } else {
            return list[size-1];
        }
    }

    private int nextIndex(int index) {
        if ((index + 1) == list.length){
            return 0;
        }
        return ++index;

    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        for (int jj = 0; jj<size; jj++){
            list[jj]=list[jj+1];
        }
        list[size] = null;
        endPosition = size;
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;

        if (endPosition == 0){
            list[DEFAULT_CAPACITY-1] = null;
        } else {
            list[endPosition - 1] = null;
        }
        if (endPosition == 0) {
            endPosition = DEFAULT_CAPACITY-1;
        }
            endPosition = nextIndex(endPosition);
            return temp;

    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " startPosition = " + startPosition + " endPosition = " + endPosition;
    }
}