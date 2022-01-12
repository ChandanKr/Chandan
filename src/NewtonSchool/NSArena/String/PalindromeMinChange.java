package NewtonSchool.NSArena.String;

import java.util.Scanner;

public class PalindromeMinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        MinNumberOfChangesReqd(str);
    }

    public static void MinNumberOfChangesReqd(String str) {
        int len = str.length();
        int changeCount = 0;
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                changeCount++;
            }
        }
        System.out.println(changeCount);
    }
}
