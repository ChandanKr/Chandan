package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class BitMan_BitDifference {
    static long sumBitDifferences(int[] arr, int n){

        long ans = 0;

        // traverse over all bits
        for (int i = 0; i < 32; i++){

            // count number of elements with i'th bit set
            long count = 0;

            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) == 0)
                    count++;

            // Adding "count * (n - count) * 2" to the answer
            long mod = 1000000007;
            ans = (ans % mod + (count % mod * (n-count) % mod * 2)) ;
        }

        return ans;
    }

    public static void main(String[] args){
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(""+sumBitDifferences(arr, n));
    }
}
