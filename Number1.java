import java.util.Scanner;
import java.util.Stack;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of sets of parentheses: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter the parentheses for set " + i + ": ");
            String parentheses = scanner.nextLine();
            if (Balanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }
    }

    private static boolean Balanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);

            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
