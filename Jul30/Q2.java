// write a java program to print factorial of all even numbers from the range 1 to 10

public class Q2{
    public static void main(String[] args) {
        int n =10;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            int prod = 1;
            for(int j=1;j<=i;j++){
                prod *=j;
            }
            System.out.println(prod);
            }
        }
    }
}