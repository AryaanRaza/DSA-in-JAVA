package stack;

import java.util.*;

public class BalancedParentheses
{

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            // If opening bracket, push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack empty → no matching opening
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

}
