package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        testMap();
        balanceTest();


//        List<String> l = new ArrayList<>();
//        l.add("asdasd");
//        l.add("zas3d");
//        l.add("re");
//
//        l.stream().flatMap(x->x.s)


        }
        public static void testMap(){
            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            map.put(5, "five");
            map.put(3, "three");
            map.put(9, "nine");
            map.put(4, "four");
            map.put(7, "seven");
            System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
            System.out.println(map.contains(9));
    }

        public static void balanceTest() {

            int numberOfTree = 100000;
            int balancedTreeCount = 0;
            int notBalancedTreeCount = 0;

            ArrayList<MyTreeMap<Integer, Integer>> list = new ArrayList<>();

//            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            for (int i = 0; i < numberOfTree; i++) {
                MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
                map = new MyTreeMap<>();
                while (map.height() < 6) {
                    map.put(((new Random().nextInt() * (100)) - 100), ((new Random().nextInt() * (100)) - 100));
                }
                list.add(map);


            if (map.isBalanced()) {
                balancedTreeCount++;
            }

            if (!map.isBalanced()) {
                notBalancedTreeCount++;
            }
        }
            System.out.println("Balanced trees = " + balancedTreeCount);
            System.out.println("Not balanced trees = " + notBalancedTreeCount);


        }
}
