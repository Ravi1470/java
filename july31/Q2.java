
// write a program to print odd digits from the given number

public class Q2 {
    public static void main(String[] args) {
        int n=34567;
        while (n != 0) {
            int remainder = n%10;
            if (remainder % 2 != 0)
                System.out.println(remainder);
            n /= 10;
        }
    }
    
}
