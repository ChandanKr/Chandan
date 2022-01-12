package SelfPractice;

import java.util.Scanner;

public class reverseFirstTwoDigitOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverseDigit(num));
    }

    static int reverseDigit(int num){
        int TwoDigitNum = num;
        while(TwoDigitNum >= 100){
            TwoDigitNum = TwoDigitNum/100;
        }
        int revNum = 0;
        while(TwoDigitNum > 0){
            revNum = revNum * 10 + TwoDigitNum % 10;
            TwoDigitNum = TwoDigitNum/10;
        }
        return revNum;
    }

}
