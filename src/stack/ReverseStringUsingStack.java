package stack;

import java.util.*;

public class ReverseStringUsingStack
{
    public static String reverse(String str){
        Stack <Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
                sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the String : ");
        String str = sc.nextLine();
        System.out.print("\nReversed string : "+reverse(str));
    }
}
