// wirte a java program to count duplicate words in the given string
//input"java is a programming language it is a high level programming language"
//output=4
public class Q3 {
    public static void main(String[] args) {
        String s = "java is a programming language it is a high level programming language";
        int num=0;
        String[] str = s.split(" ");
        boolean[] b=new boolean[str.length]; 
        for (int i = 0; i < b.length; i++) {
            if (b[i] == false) {
                int count = 1;
                for (int j = i + 1; j < b.length; j++) {
                    if (str[i].equals(str[j])) {
                        count++;
                        b[j] = true;
                    }
                }
                if (count > 1) {
                    num++;
                }
            }

        }
        System.out.println(num);

    }
}
