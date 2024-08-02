// find the counts of elements of an unsorted integer array which are equal to the average of alll elements of that array

// eg 
// 1 3 2 4 5
// 1
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int average = sum / n;
        int count = 0;

    }
}
