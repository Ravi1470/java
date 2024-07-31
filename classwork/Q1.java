// write a java program to print factorial of given number
public class Q1{
    public static void main(String[] args){
       double n =100000;
        double prod=1;
        for(long i=1;i<=n;i++){
            prod *=i;
        }
        System.out.println(prod);
    }
}