package Task;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programer_day{
    public static void main(String[] args) throws IOException {
        int year = 0;
        String str;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        year = Integer.parseInt(str);

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            str = "12/09/2000";
        }else{
            str = "13/09/2009";
        }

        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(str);
        fileOut.close();
    }
}
