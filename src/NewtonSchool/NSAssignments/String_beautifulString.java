package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class String_beautifulString {
    static int isConsecutive(String str){
        int start;
        int length = str.length();
        for(int i=0; i<length/2;i++){
            String new_str = str.substring(0,i+1);
            int num = Integer.parseInt(new_str);
            start = num;
            while(new_str.length()<length){
                num++;
                new_str = new_str+String.valueOf(num);
            }
            if(new_str.equals(str)){
                return start;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //System.out.println("String: "+str);
        int start = isConsecutive(str);
        if(start != -1){
            System.out.println("Yes "+start);
        }
        else{
            System.out.println("No");
        }
    }
}
