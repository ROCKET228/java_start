import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator*element).get();
         System.out.println(result);

         List<String> words = new ArrayList<>();
         words.add("Hi");
        words.add("ok");
        words.add("by");
        words.add("thx");

        String result2 = words.stream().reduce((a,e) -> a+ " " + e).get();
        System.out.println(result2);
    }
}
