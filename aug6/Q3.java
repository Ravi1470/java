
import java.util.Stack;

public class Q3 {

    public static void main(String[] args) {
        String s = "{{}}}";

        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '{') {
                st.push(c);
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
                count++;

            }
        }
        System.out.println(count);

    }
}
