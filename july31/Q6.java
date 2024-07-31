// write a program to check given number is strong number or not
// 145 is strong number  separate digits = 1,4,5 if we find fact of all digits then sum of all factorial is equal to the original number
public class Q6 {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *=i;
            
        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 145;
        int original = n;
        int sumOfFact = 0;

        while (n != 0) {
            int remainder = n % 10;
            sumOfFact += fact(remainder);
            n /= 10;

        }

        if (original == sumOfFact)
            System.out.println("strong number");
        else System.out.println("not strong number");
        

        
    }
    
}
