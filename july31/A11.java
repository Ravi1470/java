public class A11 {

public static void main(String[] args) {
    int n = 372641;
    int max = 0;
    while (n != 0) {
        int x = n % 10;

        max = Math.max(max, x);

        n = n / 10;
    }
 System.out.println(max);   }
}
    

