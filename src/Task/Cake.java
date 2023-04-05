package Task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileIn);
        String line = scanner.nextLine();
        int number = Integer.parseInt(line);


        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(String.valueOf(number));
        fileOut.close();
        scanner.close();
    }
}
