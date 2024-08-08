
// 1. write a program to check given two strings are anagram or not
//     String s1 = "listen";
//     String s2 = "silent";
// given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of 
// each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different.
public class Q1 {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean flag[] = new boolean[s1.length()];
        if (s1.length() != s2.length()) {
            System.out.println("not  anagram");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {

                    if (s1.charAt(i) == s2.charAt(j)) {
                        System.out.println(i + " " + s2.charAt(j));
                        flag[i] = true;
                        break;
                    }
                }
            }
        }
        for (boolean i : flag) {
            System.out.print(i + " ");
        }
    }

}
