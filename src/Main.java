import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name:");
        String role = scan.nextLine();
        if(role == "Admin"){
            System.out.println("All user");
        }
        else {
            System.out.println("Not Admin");
        }
    }
}
