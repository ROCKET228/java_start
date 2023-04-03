package Task;

public class Task_1_0 {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = 0;
        double min = 0;
        double average = 0;
        for(int i = 0; i < array.length; i++){
            if(max <= array[i]){
                max = array[i];
            }
            if(min >= array[i]){
                min = array[i];
            }
            average += array[i]/array.length;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
