package NewtonSchool.NSHackathons.June262021;

import java.util.Scanner;

public class SubsequenceProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(countSubSequenceWithPositiveProduct(arr, n));
    }

    public static int countSubSequenceWithPositiveProduct(int[] arr, int n) {
        int positiveCount = 0;
        int negativeCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){    // If the current element is positive
                positiveCount++;
            }

            if(arr[i] < 0){    // If the current element is negative
                negativeCount++;
            }
        }

        int result = (int)Math.pow(2,positiveCount);   // For all the positive elements of the array

        if(negativeCount > 0){         // For all the negative elements of the array
            result *= Math.pow(2, negativeCount - 1);
        }
        else{
            result -= 1;         // For the empty subsequence
        }

        return result;
    }
}
