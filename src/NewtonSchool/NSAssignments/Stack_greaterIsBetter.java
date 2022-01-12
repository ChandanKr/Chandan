package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class Stack_greaterIsBetter {
    public static void printSolution(int[] arr, int len) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        printSolution(arr, len);
    }
}
