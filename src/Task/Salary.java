package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        int difference = 0;
        int counter = 0;
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numberString = line.split(" ");

        for (String number: numberString){
            list.add(Integer.parseInt(number));
        }


        Collections.sort(list);
        int listSize = list.size();
        difference = list.get(listSize - 1) - list.get(0);

        file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(difference);

        scanner.close();
        pw.close();

    }

}
