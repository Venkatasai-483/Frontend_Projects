package src.basic;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parentheses = sc.nextLine();
        System.out.println(isValidParentheses(parentheses));
    }

    public static boolean isValidParentheses(String parentheses){
        Stack<Character> stack = new Stack<>();
        for(char ch : parentheses.toCharArray()){
            if(ch == '('){
                stack.push(')');
            } else if(ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            }else if(stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
