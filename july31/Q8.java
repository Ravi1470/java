// wap to check the given number is palindrome or not

public class Q8 {
    public static void main(String[] args) {
        int n = 10101;
        int original = n;
        int rev = 0;
        while (n != 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }
        if (rev == original)
            System.out.println("palindrome");
        else System.out.println("not palindrome");
      
    }

}
