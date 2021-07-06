package lesson4;

import lesson4.linkedArray.MyLinkedList;
import lesson4.linkedOneWayArray.MyOneLinkedList;
import lesson4.linkedStackList.LinkedStackList;
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        stackLinkedListTest();
        iteratorTest();

    }

    public static void stackLinkedListTest(){

        System.out.println("++++++ STACK TEST ++++++");

        LinkedStackList stackListList = new LinkedStackList();
        stackListList.push(33);
        stackListList.push(5);
        stackListList.push(44);
        stackListList.push(123);
        System.out.println(stackListList.size());
        System.out.println(stackListList.isEmpty());
        System.out.println(stackListList.peek());
        System.out.println(stackListList.toString());
        System.out.println(stackListList.pop());
        System.out.println(stackListList.toString());
        System.out.println(stackListList.pop());
        System.out.println(stackListList.toString());
        System.out.println(stackListList.pop());
        System.out.println(stackListList.toString());

    }

    public static void iteratorTest() {

        System.out.println("++++++ ITERATOR TEST ++++++");

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertLast(212);
        myLinkedList.insertLast(345);
        myLinkedList.insertLast(666);
        myLinkedList.insertLast(597);
        System.out.println(myLinkedList);
        
        for (Object z: myLinkedList) {
            System.out.println(z + " to iterate");
        }

    }
}
