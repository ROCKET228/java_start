package Task;

import java.io.*;
import java.util.*;


public class Watermelons {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("input.txt");
        Scanner scanner = new Scanner(file);
        String str;
        String result;
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()){
            str = scanner.nextLine();
            lines.add(str);
        }
        StringTokenizer st = new StringTokenizer(lines.get(1), " ");
        while ((st.hasMoreTokens())){
            weight.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(weight);
        result = weight.get(0) + " " + weight.get(weight.size() - 1);
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(result);
        fileWriter.close();
        scanner.close();
    }
}
