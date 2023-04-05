package Task;

public class LeetCodeTest {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[\\s.,:]", "");
        StringBuilder sb = new StringBuilder(s);
        String reversedString = sb.reverse().toString();

        if(s.equals(reversedString)){
            return true;
        }

        return false;
    }
}
