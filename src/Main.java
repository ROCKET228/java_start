import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stream<Integer> stream1 = Stream.of(1,23,54,65,8,34,87);
        Stream<Integer> stream2= Stream.of(1,23,54,65,8,34,87);
        Stream<Integer> stream3 = Stream.concat(stream1,stream2);
        System.out.println(stream3);
    }
}
