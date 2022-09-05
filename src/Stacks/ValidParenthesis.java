package Stacks;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValidParenthesis(String parenthesis) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValidParenthesisWithoutStack(String parenthesis) {
        int left = 0;

        for (int i=0; i<parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);
            switch (c) {
                case '(':
                    left++;
                    break;
                case ')':
                    if (left==0) {
                        return false;
                    }
                    left--;
                    break;
            }
        }

        return left==0;
    }

    public static void main(String[] args) {
        String parenthesis = "(()())(())";
        boolean isValid = isValidParenthesis(parenthesis);
        System.out.println("Is Valid : "+isValid);
    }
}
