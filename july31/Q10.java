
import java.util.Scanner;

// input 
// 7
// 9 -13 8 -7 -8 18 10 
// 18
// output
// 2
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        int discount = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (discount % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
