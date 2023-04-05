package Task;


import java.io.*;
import java.util.*;

public class Cake {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileIn);
        String line = scanner.nextLine();
        int numberIn = Integer.parseInt(line);
        int numberOut = 0;

        numberOut = (numberIn == 1) ? 0 : (numberIn % 2 == 0) ? numberIn/2 : numberIn ;


        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(String.valueOf(numberOut));
        fileOut.close();
        scanner.close();
    }
}
