import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
       int[] numbers = new int[] {5,6,8};
       System.out.println(sum(numbers));
    }

    public static int sum(int[] num){
        int sum = 0;

        for(Integer i : num){
            sum += i;
        }

        return sum;
    }
}
