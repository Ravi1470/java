
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int x = s.nextInt();
        int n = s.nextInt();

        System.out.println("array size" + n);
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);4
        }

    }
}
