// how many n most occurence digit in the array of the elements
// input
// 2
// 5
// 37 823 122 2322 6017
//output
//2322

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // getting input
        int n = sc.nextInt();
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // getting output
        int result = 0;
        int max = 0;

        for (int i : arr) {
            int count = 0;
            int original = i;
            while (i != 0) {
                int remainder = i % 10;
                if (remainder == n) {
                    count++;
                }
                i /= 10;

            }

            if (count > max) {
                result = original;
                max = count;
            }

        }
        // System.out.println(max);
        System.out.println(result);
    }

}
