import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {3,8,1,5,7,812,43,6,54};
        int result = Arrays.stream(array).filter(e -> e%2==1).map(e -> {if(e%3==0) {e=e/3;} return e;})
                .reduce((a,e) -> a+e).getAsInt();


    }
}
