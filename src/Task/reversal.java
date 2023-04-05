package Task;

import java.io.*;
import java.util.*;


public class reversal {
    public static void main(String[] args) throws IOException {
        ArrayList<String> numbers = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        String str;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
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
