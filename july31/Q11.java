
import java.util.ArrayList;

// given an array of integers find and print all the leaders of the array.A leader is defined as an element of the array which is greater than all the elements is always a leader.
// for example:
// In the array {8,7,4,3,5,2} , leaders are 8,7,5,2
// 8>7 8>4 8>3 8>5 8>2
// 7>4 7>3 7>5 7>2
// 5>2
// 2 is the right most element
public class Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[] = { 8, 7, 4, 3, 5, 2 };
        // for (int i = 0; i < arr.length; i++) {
        // 
        //     for (int j = 1; j < arr.length - 1; j++) {
        //         if (arr[i] < arr[j]) {
        //            flag = 
        //         }

        //     }

        // }
        int maxRight = arr[arr.length - 1];
        list.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                list.add(maxRight);
            }
        }

        for (int i : list) {
            System.out.println(i);
        }



    }
    
}
