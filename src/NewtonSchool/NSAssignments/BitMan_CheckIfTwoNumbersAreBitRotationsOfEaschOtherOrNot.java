package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class BitMan_CheckIfTwoNumbersAreBitRotationsOfEaschOtherOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        if(isBitRotation(x, y)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isBitRotation(long x, long y) {
        int i = 32;
        while(i-- > 0){
            long lastBit = x & 1;
            x = x >> 1;
            x = x | (lastBit << 31);

            if(x == y){
                return  true;
            }
        }
        return  false;
    }
}
