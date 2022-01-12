package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class BitMan_RightmostDifferentBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int position = 1;
        while((m+n)%2 == 0){
            position++;
            m = m >> 1;
            n = n >> 1;
        }

        System.out.println(position);
    }
}
