//  

public class Q3 {

    public static void main(String[] args) {
        int arr[] = { 5, 9, 12, 16, 25, -2};
        int k = 6;
        int count = 0;
        for (int i : arr) {
            int remainder = Math.abs(i % k);
            count += remainder;

        }
        System.out.println(count);
    }

}
