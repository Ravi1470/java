
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i++) {

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
