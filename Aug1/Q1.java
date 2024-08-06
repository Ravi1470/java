
import java.util.Scanner;

// find the count of the negative numbers in the array
// input
// 7
// 9 -3 8 -6 -7 8 10
// output
// 3
// good code never went wrong
public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // getting input
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // getting output
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
