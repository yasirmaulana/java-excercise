import java.util.List;
import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        List<String> strings = List.of("[{}()[][");

        for (String str : strings) {
            boolean isValid = isValidBrackets(str);
            System.out.println("\"" + str + "\" = " + isValid);
        }
    }

    private static boolean isValidBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        // Jika stack kosong setelah seluruh string diproses, maka valid
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '(' && close == ')') ||
                (open == '[' && close == ']');
    }
}
