// wap to print consonant from the range 'c' to 'm'

public class Q9 {
    public static void main(String[] args) {

        /*for (int i = 99; i < 110; i++) {
           char temp = (char) i;
           if (temp == 'e' || temp == 'i')
               continue;
           else System.out.println(temp);
        } */
        for (int i = 99; i < 110; i++) {
            char temp = (char) i;
            if (temp!= 'e' && temp!= 'i') {
                System.out.println(temp);
            }
        }
    }
}
       
    
