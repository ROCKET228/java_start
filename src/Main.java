import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stream<Integer> stream1 = Stream.of(1,23,1,65,8,1,87);
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
