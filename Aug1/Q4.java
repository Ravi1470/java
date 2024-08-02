// wap to given array is palindrome or not

public class Q4 {

    public static boolean palindrome(int arr[]) {
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        if (palindrome(arr) == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
