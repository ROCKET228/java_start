package Task;

import java.io.*;
import java.util.*;

public class Coins {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> coins = new ArrayList<>();
        int one = 0;
        int zero = 0;
        int out;
        String str;
        FileReader file = new FileReader("input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            str = sc.nextLine();
            coins.add(Integer.valueOf(str));
        }
        int coinsSize = coins.get(0);
        coins.remove(0);

        for (int i = 0; i < coinsSize; i++){
            if(coins.get(i) == 1){
                one++;
            } else if (coins.get(i) == 0) {
                zero++;
            }
        }

        if(one >= zero){
            out = zero;
        }else{
            out = one;
        }

        FileWriter fileOut = new FileWriter("output.txt");
        fileOut.write(String.valueOf(out));
        fileOut.close();
    }
}
