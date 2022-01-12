package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class BitMan_FixingTheMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for(int i = 0; i < testcases; i++){
            int decimalNumber = sc.nextInt();
            int noOfBits = 0;
            int tempNum = decimalNumber;
            while(tempNum != 0){
                noOfBits++;
                tempNum = tempNum >> 1;
            }
            //System.out.println(noOfBits);
            int result = 0;
            if(noOfBits % 2 == 0){  //toggling if even no. of bits found
                result = toggle(decimalNumber, noOfBits/2);
                result = toggle(result, (noOfBits/2)+1);
            }
            else{         ////toggling if odd no. of bits found
                result = toggle(decimalNumber, (noOfBits/2)+1);
            }
            System.out.println(result);
        }

    }

    public static int toggle(int n, int i) {
        int temp = 1 << (i-1);
        n = n ^ temp;
        return n;
    }


    // ANOTHER APPROACH
/*
    // return set middle bits
    static int setmiddlebits(int n)
    {

        // set all bit
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        // return middle set bits
        // shift by 1 and xor with 1
        return (n >> 1) ^ 1;
    }

    static void togglemiddlebits(int n)
    {
        // if number is 1 then
        // simply return
        if (n == 1)
            System.out.println("0");
        else if ( n == 2)
            System.out.println("1");
        else if( n == 3)
            System.out.println("0");
        else
            // XOR with middle bits
            System.out.println(n ^ setmiddlebits(n));
    }

    // Driver Code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Given number
        int n = sc.nextInt();

        // print toggle bits
        togglemiddlebits(n);
    }
*/

}
