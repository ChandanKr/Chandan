package NewtonSchool.NSHackathons.July172021;

import java.io.*;
import java.util.*;
import java.lang.*;

public class stringFormation {
    static boolean isInterleaved(String A, String B, String C)
    {
        // Find lengths of the two strings
        int M = A.length();
        int N = B.length();

        // Let us create a 2D table to store
        // solutions of subproblems. C[i][j]
        // will br true if C[0..i+j-1] is an
        // interleaving of A[0..i-1] and B[0..j-1].
        boolean arr[][] = new boolean[M + 1][N + 1];

        // IL is default initialised by false

        // C can be an interleaving of A and B
        // only if the sum of lengths of A and B
        // is equal to length of C
        if ((M + N) != C.length())
            return false;

        // Process all characters of A and B

        for(int i = 0; i <= M; i++)
        {
            for(int j = 0; j <= N; j++)
            {

                // Two empty strings have an
                // empty strings as interleaving
                if (i == 0 && j == 0)
                    arr[i][j] = true;

                    // A is empty
                else if (i == 0)
                {
                    if (B.charAt(j - 1) == C.charAt(j - 1))
                        arr[i][j] = arr[i][j - 1];
                }

                // B is empty
                else if (j == 0)
                {
                    if (A.charAt(i - 1) == C.charAt(i - 1))
                        arr[i][j] = arr[i - 1][j];
                }

                // Current character of C matches
                // with current character of A,
                // but doesn't match with current
                // character if B
                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) != C.charAt(i + j - 1))
                    arr[i][j] = arr[i - 1][j];

                    // Current character of C matches
                    // with current character of B, but
                    // doesn't match with current
                    // character if A
                else if (A.charAt(i - 1) != C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1))
                    arr[i][j] = arr[i][j - 1];

                    // Current character of C matches
                    // with that of both A and B
                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1))
                    arr[i][j] = (arr[i - 1][j] || arr[i][j - 1]);
            }
        }
        return arr[M][N];
    }

    // Function to run test cases
    static void test(String A, String B, String C)
    {
        if (isInterleaved(A, B, C))
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        test(A, B, C);
    }
}
