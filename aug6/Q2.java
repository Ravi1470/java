
public class Q2 {

    public static void main(String[] args) {
        String input = "sossrssot";
        int size = input.length() / 3;
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.substring(i * 3, (i + 1) * 3);

        }
        int count = 0;
        for (String s : arr) {
            if (s.equals("sos")) {
                count++;
            }
        }
        System.out.println(size - count);
    }
}
