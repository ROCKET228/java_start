package Task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        String allButton = "qwertyuiopasdfghjklzxcvbnm";
        String symbol;
        String result = null;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner scanner = new Scanner(file);
        symbol = scanner.nextLine();
        char[] allButtonArray = allButton.toCharArray();
        for(int i = 0; i < allButton.length(); i++){
            if(symbol.equals(String.valueOf(allButtonArray[i]))){
                if(i+1 < allButton.length()){
                    result = String.valueOf(allButtonArray[i+1]);
                }else{
                    result = String.valueOf(allButtonArray[0]);
                }
            }
        }

        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(result);
        fileOut.close();
        scanner.close();
    }
}
