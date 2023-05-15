
import java.util.*;

public class Main {
    public static int searchInsert(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int mid = (right + left)/2;
        while(left <= right){
            mid = (right + left)/2;

            if(nums[mid] < target){

                left = mid + 1;
            }else if(nums[mid] > target){

                right = mid - 1;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return 0;
    }


    public static void main(String[] args) throws InterruptedException {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }

}




