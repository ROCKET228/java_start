import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("ok");
        list.add("by");
        list.add("thx");
        list.add("norm");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        //System.out.println(list2);

        int[] array = {5,9,3,8,1};

        array = Arrays.stream(array).map(element -> {
            if(element % 3 == 0){
                element = element / 3;
            }
            return element;
        }).toArray();
        //System.out.println(Arrays.toString(array));


        Set<String> set = new TreeSet<>();
        set.add("Hi");
        set.add("ok");
        set.add("by");
        set.add("thx");
        set.add("norm");

       Set<Integer> set1 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
