package Task;

import java.io.*;
import java.util.*;

public class Zero {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("input.txt");
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        char[] symbols = str.toCharArray();
        int count = 0;
        int numberOfZero = 0;
        for(char symbol  : symbols){
            if(symbol == '0'){
                count++;
            }else if(symbol == '1'){
                if (numberOfZero < count){
                    numberOfZero = count;
                }
                count = 0;
            }
        }
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(Integer.toString(numberOfZero));
        fileWriter.close();
        scanner.close();
    }
}
