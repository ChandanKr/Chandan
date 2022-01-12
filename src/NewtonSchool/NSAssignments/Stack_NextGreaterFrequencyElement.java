package NewtonSchool.NSAssignments;

import java.util.Scanner;
import java.util.Stack;

public class Stack_NextGreaterFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] frequency = new int[max + 1];
        for(int i = 0; i < (max + 1); i++){
            frequency[i] = 0;
        }
        
        for(int i = 0; i < len; i++){
            frequency[arr[i]]++;
        }
        
        nextGreaterFrequencyElement(arr, len, frequency);
    }

    public static void nextGreaterFrequencyElement(int[] arr, int len, int[] frequency) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            res[i] = 0;
            for(i = 1; i < len; i++){
                if(frequency[arr[st.peek()]] > frequency[arr[i]]){
                    st.push(i);
                }
                else{
                    while(frequency[arr[st.peek()]] < frequency[arr[i]] && st.size() > 0){
                        res[st.peek()] = arr[i];
                        st.pop();

                        if(st.size() == 0){
                            break;
                        }
                    }
                    st.push(i);
                }
            }
            while(st.size() > 0){
                res[st.peek()] = -1;
                st.pop();
            }

            for(i = 0; i < len; i++){
                System.out.print(res[i]+" ");
            }
        }
    }
}
