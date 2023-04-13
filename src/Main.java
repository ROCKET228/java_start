import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(89);
        numbers.add(4);
        numbers.add(12);

        List<Integer> list = numbers.stream().filter(integer -> integer.intValue() > 4).collect(Collectors.toList());

        System.out.println(list);
    }
}
