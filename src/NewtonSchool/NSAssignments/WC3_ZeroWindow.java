package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class WC3_ZeroWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stringLength = sc.nextInt();
        int subStringLength = sc.nextInt();
        String str = sc.next();

        int numberOfSubString = countSubString(str, subStringLength, stringLength);
        System.out.println(numberOfSubString);
    }

    public static int countSubString(String str, int subStringLength, int stringLength) {
         int i = 0;
         int j = 0;
         int count = 0;
         int zerosCount = 0;
         int onesCount = 0;
         while(i < stringLength){
             if (str.charAt(i) == '0') {
                 zerosCount++;
             }
             else{
                 onesCount++;
             }

             if(i-j+1 < subStringLength){
                 i++;
             }
             else{
                 if(i-j+1 == subStringLength){
                     if(zerosCount >= onesCount){
                         count++;
                     }

                     if(str.charAt(j) == '0'){
                         zerosCount--;
                     }
                     else{
                         onesCount--;
                     }
                     i++;
                     j++;
                 }
             }
         }
         return count;
    }
}
