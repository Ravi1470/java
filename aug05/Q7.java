// write  a program to reverse each element(**the element must be a number)of an array amd place  it in the same index position
//arr1={123,456,789} 
//output={321,654,987}

public class Q7 {
    public static void main(String[] args) {
        int arr[] = {123, 456, 789};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i != 0) {
                int k = i % 10;
                num = num * 10 + k;
                i = i / 10;
            }
            System.out.println(num);
        }

        
    }
}
