package NewtonSchool.NSAssignments;

import java.util.Stack;

public class Stack_nearestSmallerElement {
    // Prints smaller elements on left side of every element
    static void printPrevSmaller(int[] arr, int n) {
        // Create an empty stack
        Stack<Integer> S = new Stack<>();

        // Traverse all array elements
        for (int i = 0; i < n; i++) {
            // Keep removing top element from S while the top
            // element is greater than arr[i]
            if (!S.empty() && S.peek() > arr[i]) {
                S.pop();
            }

            // If all elements in S were greater than arr[i]
            if (S.empty()) {
                System.out.print("-1 ");
            }
            else //Else print the nearest smaller element
            {
                System.out.print(S.peek() + " ");
            }

            // Push this element
            S.push(arr[i]);
        }
    }

    /* Driver program to test insertion sort */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        int n = arr.length;
        printPrevSmaller(arr, n);
    }
}
