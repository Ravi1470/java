
//input -aBc12#
//output =AbC12#
//input -hElLo WoRLd#
//output =HeLlO wOrlD#
public class Q4{
    public static void main(String[] args) {
        String s = "aBc12#";
        char[] ch = s.toCharArray();
        String str = " ";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] - 32);
                str = str + ch[i];
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
                str = str + ch[i];
            } else {
                str = str + ch[i];
            }

        }
        System.out.println(str);
    }
    
}
