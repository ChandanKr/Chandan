//Given two positive integers N and M. The task is to check whether N is a Special-M-visor or not.
//Special-M-visor: A number is called Special-m-visor if it has exactly M even divisors for a given N.

package SelfPractice;
import java.util.*;
import java.lang.*;

public class SpecialMVisor {
    // Returns sum of all factors of n.
    public static int sumofFactors(int n)
    {

        if (n % 2 != 0)
            return 0;

        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i += 2)
        {
            while (n % i == 0)
            {
                count++;
                n = n / i;
            }
        }
       return count;
    }

    public static void main(String[] argc){
        int n = 4;
        System.out.println(sumofFactors(n));
    }
}
