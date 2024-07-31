
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;

        while (n != 0) {
            int remainder = n % 10;
            if (remainder % 2 == 0)
                even += remainder;
            else
                odd += remainder;
            n /= 10;
        }
        System.out.println(odd*even);

    }
    
}
