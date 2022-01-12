package NewtonSchool.NSAssignments;

import java.util.Scanner;
import java.util.Stack;

public class Stack_infixToPostfix {
    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int operatorPrecedence(char ch)
    {
        switch (ch)
        {
            case '+': return 1;
            case '-': return 1;

            case '*': return 2;
            case '/': return 2;

            case '^': return 3;

        }
        return -1;     
    }


    static String infixToPostfix(String infix)
    {
        // initializing empty String for result
        String postfix = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<infix.length(); ++i)
        {
            char c = infix.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                postfix += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix += stack.pop();

                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && operatorPrecedence(c) <= operatorPrecedence(stack.peek())){
                    postfix += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            postfix += stack.pop();
        }
        return postfix;
    }

    // Driver method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        //String exp = "((A-(B/C))*((A/K)-L))";
        System.out.println(infixToPostfix(infix));
    }
}
