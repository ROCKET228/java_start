
import java.util.*;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                System.out.println(nums[j]);
                nums[j] = nums[i];
                System.out.println(nums[j]);
                j++;
            }
        }
        System.out.println(Arrays.toString(nums) + j);
        return j;
    }
    public static void main(String[] args) throws InterruptedException {
        int[] nums = {3,2,2,3};
        removeElement(nums, 3);
    }

}




