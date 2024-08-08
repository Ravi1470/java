
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// 1. write a java program to remove hashset elements contained in other hashset
// input :
// h1: 50 ,20,70,40,10,60,30
// h2: 80,20,70,10,90,30
// output:
// h1: 50,40,60
public class Q1 {

    public static void main(String[] args) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        for (int i = 0; i < size1; i++) {
            map1.add(sc.nextInt());
        }
        for (int i = 0; i < size2; i++) {
            map2.add(sc.nextInt());
        }
        System.out.println(map1);
        System.out.println(map2);

        Iterator<Integer> iterator = map1.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
            if (map2.contains(element)) {
                iterator.remove(); // Safely removes the element
            }
        }

        System.out.println(map1);

    }

}
