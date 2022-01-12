package NewtonSchool.NSAssignments;

import java.util.Scanner;
import java.util.Stack;

public class WC5_LexoSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

//        int[] arr = {12, 2, 1, 3, 4};
//        int k = 2;

        int[] res = printSmallestSubString(arr, k);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int[] printSmallestSubString(int[] arr, int k){
        Stack<Integer> st = new Stack<>();
        int len = arr.length;

        for(int i = 0; i < len; i++){
            int val = arr[i];

            while(st.size() > 0 && arr[i] < st.peek() && len-i-1 >= k-st.size()){
                st.pop();
            }
            if(st.size() < k){
                st.push(val);
            }
        }

        int[] ans = new int[k];
        int i = k-1;
        while(i >= 0){
            ans[i--] = st.pop();
        }
        return ans;
    }
}
