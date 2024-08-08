
public class Q5 {

    public static long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    public static boolean checkCoPrime(long a, long b) {

        if (gcd(a, b) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        long a = 9999999;
        long b = 1234567;
        System.out.println(a % b);

        System.out.println(checkCoPrime(a, b));

    }
}
