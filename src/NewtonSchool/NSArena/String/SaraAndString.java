package NewtonSchool.NSArena.String;

import java.util.Scanner;

public class SaraAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int minChangeRequired = 0;
        for(int i = 0; i < len; i++){

            if(Character.isUpperCase(str.charAt(i))){
                upperCaseCount++;
            }
            else{
                lowerCaseCount++;
            }
        }

        minChangeRequired = Math.min(upperCaseCount, lowerCaseCount);

        System.out.println(minChangeRequired);
    }
}
