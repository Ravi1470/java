
// write a java program to print elements thoose who are not having vowels.

public class Q1 {
    public static void main(String[] args) {
        String[] s = {"abc", "hi", "sdf", "xyz", "efg"};

        for (String i : s) {
            boolean flag = true;
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) == 'a' || i.charAt(j) == 'e' || i.charAt(j) == 'i' || i.charAt(j) == 'o'
                        || i.charAt(j) == 'u') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
