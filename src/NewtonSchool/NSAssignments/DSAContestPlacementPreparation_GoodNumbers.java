//INCOMPLETE

package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class DSAContestPlacementPreparation_GoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextInt();
        long x = sc.nextLong();

        long count = 0;

        /*if(a < x){
            a = x;
        }

        for(long i = a; i <= b; i += x){
            if(i % x == 0){
                count++;
            }

        }*/

        if(a % x == 0){
            count = (b/x) - (a/x) + 1;
        }
        else{
            count = (b/x) - (a/x);
        }
        System.out.println(count);
    }
}
