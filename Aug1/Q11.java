
// write a program to find second largest element from the array
public class Q11 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 51, 3, 2, 43, 5, 2};
        int firstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > firstMax) {
                firstMax = i;
                if (firstMax > SecondMax && firstMax != i) {
                    SecondMax = Math.max(i, SecondMax);
                }
            }
        }
        System.out.println(firstMax);
        System.out.println(SecondMax);

    }
}
