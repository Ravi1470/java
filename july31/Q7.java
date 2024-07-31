
public class Q7 {
    public static void main(String[] args) {

        int n = 200;
        int original = n;
        int sum = 0;

        while (n != 0) {
            int remainder = n % 10;
            sum += remainder;
            n /= 10;

        }

        if (original%sum==0)
            System.out.println("Harsad number");
        else
            System.out.println("not Harsad number");
        
      //  if (1 == 0)
         //   System.out.println("fjdalskjfalskdfja");
         //   System.out.println("in if");

        if (1 == 0) 
            System.out.println("fjdalskjfalskdfja");
            
            System.out.println("in bracked if");  
        


        
    }
}
