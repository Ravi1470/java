import java.util.*;
public  class habit {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.print("Enter a number ");
        int n =s.nextInt();
        int sum=1;
        for(int i=1;i<n;i++){
            if(n%i==0)
            {
                sum=sum*i;
           
           
             }
        }
        if (sum==n){
            System.out.println(n+" is a perfect number");

        }
        else{
            System.out.println(n+" is not a perfect number");
        }
    }
}