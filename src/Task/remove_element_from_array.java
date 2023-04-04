package Task;
import java.util.Arrays;

public class remove_element_from_array {
    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(removeElement(test_array, 2)));
    }

    private static int[] removeElement(int[] testArray, int target) {

        int removeElementCount = 0;

        for(int i = 0; i < testArray.length; i++){
            if(testArray[i] == target){
                removeElementCount++;
            }else {
                testArray[i - removeElementCount] = testArray[i];
            }
        }



        return Arrays.copyOf(testArray, testArray.length - removeElementCount);
    }
}
