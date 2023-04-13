import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {5,1,3,6,6};

        Arrays.stream(array).forEach(System.out::println);

    }
}
