package Task;

import java.io.*;
import java.util.*;

public class BoltsAndNuts {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("input.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> numbers = new ArrayList<>();
        String str;
        int result = 0;
        while (scanner.hasNextLine()){
             str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                numbers.add(Integer.valueOf(st.nextToken()));
            }
        }
        System.out.println(numbers);
        int k1 = numbers.get(0);
        int l1 = numbers.get(1);
        int m1 = numbers.get(2);
        int k2 = numbers.get(3);
        int l2 = numbers.get(4);
        int m2 = numbers.get(5);

        double percentageBolts = l1 / 100.0;
        int resultBolts = (int) (k1 * percentageBolts);
        System.out.println(resultBolts);
        int saveBolts = k1 - resultBolts;


        double percentageNuts = l2 / 100.0;
        int resultNuts = (int) (k2 * percentageNuts);
        System.out.println(resultNuts);
        int saveNuts = k2 - resultNuts;

        if(saveBolts > saveNuts){
            result = (saveBolts - saveNuts) * m1;
        } else if (saveBolts < saveNuts) {
            result = (saveNuts - saveBolts) * m2;
        }

        result += (resultBolts * m1) + (resultNuts * m2);


        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(Integer.toString(result));
        fileWriter.close();
        scanner.close();

    }
}
