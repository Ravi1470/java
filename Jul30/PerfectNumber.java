public class PerfectNumber{

    public static boolean perfectNumber(int n){
        int count =1;
        for (int i = 2; i*i <n; i++) {
            if(n%i==0){
                // System.out.println("i"+i);
                int temp = n/i;
                count = i + temp +count;  
            } 
            // System.err.println("count"+count);   
        }
        boolean result = count == n ? true : false;
        return result;
    }

    public static void printPerfectNumber(int end){
        for(int i = 2;i<end;i++){
            if(perfectNumber(i)) System.err.println(i);
        }
    }



    public static void main(String[] args) {
        int n =496;
       // System.err.println(perfectNumber(n));
        printPerfectNumber(n);

    }

}