
public class Q10 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 4};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                maxCount++;
            }
            if (min == arr[i]) {
                minCount++;
            }
        }
        System.out.println((max * maxCount + min * minCount) / (maxCount + minCount));
    }
}
