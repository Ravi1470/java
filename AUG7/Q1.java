
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        int key = 12;
        Collections.sort(arr);

        int high = arr.size() - 1;
        int low = 0;

        boolean flag = false;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (key == arr.get(mid)) {
                flag = true;
            } else if (key > arr.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (flag) {
            System.out.println("fount");
        } else {
            System.out.println("not found");
        }

    }

}
