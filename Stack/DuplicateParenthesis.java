import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // 1. closing
            int count = 0;
            if (ch == ')') {
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                // 2. opening , operator , operand
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";
        System.out.println(isDuplicate(str));

    }
}