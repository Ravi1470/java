
// write a program to print occurences of each element of the given array
import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            // map.put(key, map.getOrDefault(key, 0) + 1);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.print(map);
    }
}
