
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < size2; i++) {
            arr1.add(sc.nextInt());
        }
        Collections.sort(arr);
        Collections.sort(arr1);
        ArrayList<Integer> result = new ArrayList<>();

        /* int i = 0;
        int j = 0; */
 /* while (i < arr.size()) {
            while (j < arr1.size()) {
                if (arr.get(i) == arr1.get(j)) {
                    result.add(arr.get(i));
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        
        } */
        int i = 0;
        int j = 0;
        while (i < Math.min(arr.size(), arr1.size())) {
            if (arr1.get(j) == arr.get(i)) {
                result.add(arr.get(i));
                i++;
                j++;
            } else if (arr.get(i) < arr1.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(result);
    }
}
