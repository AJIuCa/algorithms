package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {



    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Stack() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(T item) {
        if (isFull()) {
            expansionArray();
        }
        list[size] = item;
        size++;

        if (size == list.length || size > list.length){
            expansionArray();
        }
    }

    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
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

    public T[] getList() {
        return list;
    }

    private void reCapacity(int newCapacity) {

        T[] tempArr = Arrays.copyOf(list, newCapacity);
        list = tempArr;
    }

    // 3. Реализовать расширение массива в стеке при заполнении стека.
    private void  expansionArray() {

        T[] list2 = Arrays.copyOf(list, (size/2 + size) + 1);
        list = list2;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}