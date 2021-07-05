package lesson3;

public class Main {

    public static void main(String[] args) {
//        firstTask();
        thirdTask();

    }

    public static void startApp() {

    }

    public static void firstTask() {

        //1. Создать программу, которая переворачивает вводимые строки (читает справа налево).

        System.out.println("Task #1");
        System.out.println("1. Создать программу, которая переворачивает вводимые строки (читает справа налево).");

        String randomWord = "Adeptus Mechanicus";
        System.out.println("Origin word = " + randomWord);

        char[] startCharArray = randomWord.toCharArray();

        Stack<Character> mirror = new Stack<>();
        for(char j: startCharArray){
            mirror.push(j);
        }
        int mirrorLength = mirror.size();
        char[] endCharArray = new char[mirrorLength];

        for (int i = 0; i <mirrorLength; i++) {
            endCharArray[i] = mirror.pop();
        }

        System.out.println("Word after flipping= " + (new String(endCharArray)));

    }

    public static void thirdTask(){

//        Deque<Integer> deque = new Deque<>();
//        deque.insertLast(2);
//        System.out.println(deque);
//        deque.insertLast(55);
//        System.out.println(deque);
//        deque.insertLast(13);
//        System.out.println(deque);
//        deque.insertFirst(2222);
//        System.out.println(deque);
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());
//        deque.insertFirst(121200003);
//        System.out.println(deque);
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());



        MyDeque<Integer> deque = new MyDeque<>();



//        deque.insertLeft(12);
//        System.out.println(deque);
//        deque.insertLeft(232);
//        System.out.println(deque);
//        deque.insertLeft(3444);
//        System.out.println(deque);
//        deque.insertRight(10);
//        System.out.println(deque);
//        deque.insertLeft(666);
//        System.out.println(deque);

        deque.insertRight(12);
        System.out.println(deque);
        deque.insertRight(232);
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        deque.insertRight(3444);
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        deque.insertLeft(10);
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        deque.insertRight(666);
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        deque.removeLeft();
        System.out.println(deque);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
//        deque.removeRight();
//        System.out.println(deque);
//        System.out.println(deque.peekLeft());
//        System.out.println(deque.peekRight());






    }

}
