package Task;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array); // нужно сначала отсортировать
        long time = System.currentTimeMillis(); // текущее время, unix-time
        System.out.println("Answer:" + bruteForce(array, 0.5));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println("Answer:" + binarySearch(array, 0.5));
        System.out.println(System.currentTimeMillis() - time);
    }

    private static int binarySearch(double[] array, double target){
        int low = 0;
        int heigh = array.length - 1;

        while (low <= heigh){
            int mid = (low + heigh);
            double midVal = array[mid];
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

    public static int bruteForce(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
}
