// write a java program to print factorial of all prime numbeer from the range 10 to 1

public class Q3{

    public static double factorial(int n){
            double prod = 1;
            for(int j=1;j<=n;j++){
                prod *=j;
            }
            return prod;
    }
    public static boolean isPrime(int n){
        boolean result = true;
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) result= false;
        }
        return result;
    }
    public static void main(String[] args) {
        int n =25;
        for(int i=n;i>=1;i--){
            if(isPrime(i)){
               System.out.println(factorial(i)); 
            }

        }
        System.out.println(10E2);
    }
}