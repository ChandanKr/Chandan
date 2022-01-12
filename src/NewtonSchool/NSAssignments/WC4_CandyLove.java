package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class WC4_CandyLove {
    /*
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long t = sc.nextLong();

        System.out.println(andyCanBuy(a, b, t));
    }

    public static long andyCanBuy(long a, long b, long t) {
        long sum = 0;
        long x = 0;
        long temp = 0;
        while(sum <= t){
            x++;
            temp = x-1;
            long fOfX = noOfDigits(x);
            sum = (a * x) + (b * fOfX);
        }
        return temp;
    }

    public static long noOfDigits(long x) {
        long count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        return count;
    }
    */

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long A=sc.nextLong();
        long B=sc.nextLong();
        long T=sc.nextLong();
        long l=1,h=1000000000;
        while(l<=h){
            long middle=l+(h-l)/2;
            long ans=answer(middle, A, B);
            if(ans<=T){
                l=middle+1;
            }
            else{
                h=middle-1;
            }
        }

        if(answer(h, A, B) <= T){
            System.out.print(h);
        }
        else{
            System.out.print(l);
        }
    }
    public static long answer(long middle, long A, long B){
        long temp=middle,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        return A*middle+B*count;
    }
}
