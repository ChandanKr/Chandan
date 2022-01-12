package NewtonSchool.NSArena.String;

import java.util.Scanner;

public class RomanNumberToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();;

        System.out.println(romanToInteger(str));
    }

    public static int RomanValue(char r){
        if(r == 'I' || r == 'i')
            return 1;
        if(r == 'V' || r == 'v')
            return 5;
        if(r == 'X' || r == 'x')
            return 10;
        if(r == 'L' || r == 'l')
            return 50;
        if(r == 'C' || r == 'c')
            return 100;
        if(r == 'D' || r == 'd')
            return 500;
        if(r == 'M' || r == 'm')
            return 1000;

        return  -1;
    }

    public static int romanToInteger(String str){
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            int c1 = RomanValue(str.charAt(i));

            if((i + 1) < str.length()){
                int c2 = RomanValue(str.charAt(i + 1));

                if(c1 >= c2){
                    result += c1;
                }
                else{
                    result += c2 - c1;
                    i++;
                }
            }
            else{
                result += c1;
            }
        }
        return  result;
    }

}
