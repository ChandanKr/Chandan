package NewtonSchool.NSAssignments;

import java.util.Scanner;
import java.util.Stack;

public class WC3_PairHateUsingStack {
    // tc -> n, sc-> n-d, where d is the number of duplicate chars
    public static String removePairDup(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!st.isEmpty() && st.peek()==c){
                st.pop();   // removing adjacent duplicates
            }
            else{
                st.push(c);    // storing non-duplicates in adjacent
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);      // it is taking from stack in insertion order
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(removePairDup(str));
    }
}
