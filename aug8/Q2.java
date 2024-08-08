
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// 2.write a program to print all elements of hashset one by one without using for each loop.
// input: [null,17,s,XYZ,18.8,10]
// output:
// null
// 17
// s
// XYZ
// 18.8
// 10
public class Q2 {

    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            set.add(sc.next());
        }
        // for (Object a : set) {
        //     System.out.println(a);
        // }
        Iterator<Object> it = set.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
    }

}
