// write a program to check the given number is special number or not
// special number=19  digit : 1 % 9  add those digits = 10 product of digits = 9 if we add product and sum results the same number as 19

public class Q5 {
    public static void main(String[] args) {
        int n = 19;
        int original = n;
        int sum = 0;
        int prod = 1;
        while (n != 0) {
            int remainder = n % 10;//9,1
            sum = sum+remainder;//9+1=10
            prod = prod * remainder;//9*1=9
            n /= 10;
        }
        int result = sum + prod;
        if(result == original) System.out.println("special number");
        else System.out.println("not special number");
    }
    
}
