
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Q3 {

    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        // maintain insertion order
        // random access is not allowed
        // only one null object is allowed
        h.add("xyz");
        h.add(10.00);
        h.add(10.0);
        h.add(null);
        h.add(null);
        h.add('s');

        System.out.println(h);
        System.out.println("for each");
        for (Object i : h) {
            System.out.println(i);

        }
        System.out.println("iterator method");
        Iterator element = h.iterator();
        while (element.hasNext()) {
            System.out.println(element.next());
        }
    }
}
