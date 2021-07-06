package lesson4.linkedStackList;

import lesson3.Stack;
import lesson4.linkedArray.MyLinkedList;

import java.util.EmptyStackException;

public class LinkedStackList<T>  {

    private MyLinkedList<T> list = new MyLinkedList<>();


    public void push(T item) {
        list.insertLast(item);
    }


    public Object pop() {
        return list.removeLast();
    }


    public Object peek() {
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getLast();
    }



    public boolean isEmpty() {
        return list.isEmpty();
    }


    public int size() {
        return list.size();
    }
//
//
//    public Object[] getList() {
//        return super.getList();
//    }
//
//
    public String toString() {
        return list.toString();
    }
}
