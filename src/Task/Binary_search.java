package Task;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis(); // текущее время, unix-time
        System.out.println("Answer:" + bruteForce(array, 500));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println("Answer:" + binarySearch(array, 500));
        System.out.println(System.currentTimeMillis() - time);
    }

    private static int binarySearch(int[] array, int target){
        int low = 0;
        int heigh = array.length - 1;

        while (low <= heigh){
            int mid = (low + heigh)/2;
            System.out.println(mid);
            int midVal = array[mid];
            if (midVal < target){
                low = mid + 1;
            } else if (midVal > target) {
                heigh = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }

    public static int bruteForce(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    private static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
        return array;
    }
}
