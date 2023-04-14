import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stream<Integer> stream1 = Stream.of(1,23,54,65,8,34,87);
        stream1.distinct().forEach(System.out::println);
    }
}
