
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        name = name.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < name.length() - 1; i++) {
            // System.out.println(name.charAt(i) + " " + name.charAt(name.length() - i - 1));
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }

    }
}
