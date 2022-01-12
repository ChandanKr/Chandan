//INCOMPLETE - RE(NZEC) in all testcases except 1

/*      standard input/output: 2s/128000 kB

        Given a number N in the form of a string, find the number of its good substrings.
        A good substring is a substring that is divisible by the given prime p. A good substring can start with a 0.

        Input
        The first line of input contains a single number, the length of the string, |N|
        The second line of input contains the number N.
        The third and final line of input contains a prime number p.

        Constraints
        1 <= |N| <= 100000
        2 <= p <= 10000
        p is a prime number

        Output
        The only line of output contains the number of good substrings.

        Sample Input
        4
        3543
        3

        Sample Output
        6

        Explanation
        Good substrings are 3, 354, 3543, 54, 543, 3
        */

package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class DSACodingTest_PrimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        int p = sc.nextInt();
        subString(str, len, p);

    }

    static void subString(String str, int len, int p){
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j <= len; j++){
                String s = (str.substring(i, j));
                int tempNum = Integer.parseInt(s);

                if(tempNum % p == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
