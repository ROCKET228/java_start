package Task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) throws IOException {
        int month;
        String season;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        month = Integer.parseInt(sc.nextLine());

        season = (month == 1 || month == 2 || month == 12) ? "Winter" : (month == 3 || month == 4 || month == 5) ? "Spring" :
                (month == 6 || month == 7 || month == 8) ? "Summer" :
                (month == 9 || month == 10 || month == 11) ? "Autumn" : "Error";

        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(season);
        fileOut.close();
    }
}
