// write a program  to separate the dight from the given number
/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        int n=112;

        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}