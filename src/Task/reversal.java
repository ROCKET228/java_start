package Task;

import java.io.*;
import java.util.*;


public class reversal {
    public static void main(String[] args) throws IOException {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList <String> lines = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        String str;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            str = sc.nextLine();
            lines.add(str);
        }
        StringTokenizer st = new StringTokenizer(lines.get(1), " ");
        while (st.hasMoreTokens()){
            numbers.add(st.nextToken());
        }

        Collections.reverse(numbers);

        for(String number: numbers){
            out.append(number).append(" ");
        }

        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(out.toString());
        fileOut.close();
    }
}
