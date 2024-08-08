
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());

        }
        Collections.sort(arr);
        int i = 0;
        int j = 1;
        while (i < arr.size() && j < arr.size()) {
            if (arr.get(i) == arr.get(j)) {
                arr.remove(j);
            } else {
                i++;
                j++;
            }

        }
        System.out.println(arr);

    }
}
