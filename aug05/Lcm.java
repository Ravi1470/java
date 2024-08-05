public class Lcm {
    // Java Program to find 
    // the LCM of two numbers

    // main function
    public static void main(String[] args) {
        // Numbers
        int a = 15, b = 25;

        // Checking for the largest
        // Number between them
        int ans = (a > b) ? a : b;//find largest   number
     
        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            //75%15==0&&75%25==0
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;// increase max value
        }

        // Printing the Result
        System.out.println("LCM of " + a + " and " + b
                + " : " + ans);
    }
}



 