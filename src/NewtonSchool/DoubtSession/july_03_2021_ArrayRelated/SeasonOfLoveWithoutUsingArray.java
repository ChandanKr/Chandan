package NewtonSchool.DoubtSession.july_03_2021_ArrayRelated;

import java.util.Scanner;

public class SeasonOfLoveWithoutUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

//        int numberOfGroups = N / 3;
//        int extraRoses = N % 3;
//
//
//        if(extraRoses == 2) {
//            numberOfGroups = numberOfGroups + 1;
//        }
//
//        System.out.println(numberOfGroups);

        int numberOfGroups = (N / 3) + ((N % 3) / 2);

        System.out.println(numberOfGroups);
    }
}
