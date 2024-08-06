
public class Sample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < 100000; i++) {
            System.out.println(i);

        }
        long endTime = System.currentTimeMillis();    // Record end time
        long duration = endTime - startTime;

        // Calculate elapsed time
        double minutes = duration / (1000.0);

        System.out.println("Execution time : " + minutes);

    }
}
