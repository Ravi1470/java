
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.println(i);
            if (arr.get(i) % 2 != 0) {
                arr.remove(i);
                i = i - 1;
            }
        }
        System.out.println(arr);
    }
}
