package lesson3;

import java.util.Arrays;

public class Queue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int startPosition = 0;
    private int endPosition =0;



    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Queue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            expansionArray();
        }
        size++;
        list[endPosition] = item;
        endPosition = nextIndex(endPosition);
    }

    public T remove() {
        T temp = peek();
        size--;
        list[startPosition] = null;
        startPosition = nextIndex(startPosition);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[startPosition];
    }

    private int nextIndex(int index) {
        if ((index + 1) == list.length){
            return 0;
        }
        return ++index;

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

    //4 ***. Реализовать расширение массива в очереди при заполнении очереди.
    private void  expansionArray() {

        T[] list2 = Arrays.copyOf(list, (size/2 + size) + 1);
        list = list2;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + startPosition + " e = " + endPosition;
    }
}