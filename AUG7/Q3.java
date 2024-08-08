
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        System.out.println(arr);
    }

}
