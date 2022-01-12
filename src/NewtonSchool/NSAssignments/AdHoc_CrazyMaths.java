//WA = INCOMPLETE
package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class AdHoc_CrazyMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i] | arr[j];
                arr[j] = arr[i] & arr[j];
                arr[i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int square = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            square = arr[i]*arr[i];
            sum += square;
        }
        System.out.println(sum);
    }
}
