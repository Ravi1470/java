
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
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                maxCount++;
                System.out.println("maxcount "+maxCount);
            }
            if (min == arr[i]) {
                minCount++;
                System.out.println("mincount " + minCount);
            }
                            } //(4*2+1*1)/(2+1)
                                                                //9/3
        System.out.println((max * maxCount + min * minCount) / (maxCount + minCount));
    }
}
