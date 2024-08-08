
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.add(sc.next());
        }

        Collections.reverse(arr);
        System.out.println(arr);
    }

}
