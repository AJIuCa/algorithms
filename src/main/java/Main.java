import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("azw");
        list.add("zqwf");
        list.add("e31a");

//        List<String> list1;
//        String [] massiv;
//        massiv = list.stream().flatMap(x -> Arrays.stream(x)).toArray();
//        Arrays.stream(massiv).forEach(x-> System.out.println(x));

//        list1.stream().forEach(x-> System.out.println(x));

//        String[] arrayOfWords = {"STACK", "OOOVVVER"};
        String[] arrayOfWords = {"STACK", "OOOVVVER"};

//        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
//        List<String> kk = new ArrayList<>();
//        kk = Arrays.stream(arrayOfWords) //Converting word in to array of letters
//                .flatMap(array -> Arrays.stream(new String[]{array})).distinct() //flattens each generated stream in to a single stream
//                .collect(Collectors.toList());
//
//        kk.forEach(x-> System.out.println(x));


//        List<Integer> list1 = Arrays.asList(1, 2, null);
//        list1.set(0,23);
//        list1.stream().forEach(x-> System.out.println(x));

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(10);
        l.add(5);
        List<Integer> newList = l.stream().map(x->x*100).flatMap(x->Stream.of(x, x*10, x*100)).collect(Collectors.toList());
        newList.stream().forEach(x-> System.out.println(x));


    }
}
