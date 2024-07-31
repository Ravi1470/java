// write aprogram to find largest digit from the given number
public class Q3 {
    public static void main(String[] args) {
        int n = 32387634;
        int max = 0;
        // System.out.println(max);

        while (n != 0) {
            int remainder = n % 1;
             max = Math.max(max,remainder);
           // max = (max>=remainder)? max: remainder;
            n /= 10;

        }
        System.out.println(max);
    }
}
