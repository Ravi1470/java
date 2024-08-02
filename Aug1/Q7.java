
import java.util.HashMap;

public class Q7 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 5, 2, 1, 5, 6, 2, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            System.out.println(i + "=" + map.get(i));
        }
    }
}
