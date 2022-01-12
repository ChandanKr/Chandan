//WA = INCOMPLETE
package NewtonSchool.NSArena.Arrays.OneD;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberToMakeMedianX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            long n = sc.nextLong();
            long x = sc.nextLong();
            long[] arr = new long[(int) n];
            for(long i = 0; i < n; i++){
                arr[(int) i] = sc.nextLong();
            }

            System.out.println(minNumber(arr, x));
        }
    }

    public static long minNumber(long[] arr, long x) {
        Arrays.sort(arr);

        long len = arr.length;
        long k;
        for(k = 0; arr[(int) ((len)/2)] != x; k++){
            arr[(int) (len-1)] = x;
            Arrays.sort(arr);
            len++;
        }
        return k;
    }
}
