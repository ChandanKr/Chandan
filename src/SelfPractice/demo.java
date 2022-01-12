//package SelfPractice;
//
//import java.util.Scanner;
//
//public class demo {
//    /*public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       int x = sc.nextInt();
//       int num = noOfDigits(x);
//        System.out.println("Total Digits: "+num);
//
//
//    }
//    public static int noOfDigits(int x) {
//        *//*int count = 0;
//        while(x != 0){
//            x = x/10;
//            count++;
//        }
//        return count;*//*
//        if(x/10 == 0)
//            return 1;
//        return 1 + noOfDigits(x/10);
//    }*/
//
////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////        int a = 4;
//////        double d = 4.0;
//////        String s = "Chandan ";
//////
//////        int b = sc.nextInt();
//////        double dd = sc.nextDouble();
//////        //String ss = sc.nextLine(); // This happens because of nextInt.... see details at stack overflow
//////        String str = sc.nextLine();
//////
//////        System.out.println(a+b);
//////        System.out.println(d + dd);
//////        System.out.println(s + str);
//////    }
//
//
//    public static void main (String[] args) {
//// 		System.out.println("GfG!");
//        int[] arr = {2, 4, 5, 7};
//        int len = arr.length;
//
//        //Arrays.sort(arr);    // sort if array is not
//
//        for(int i = 0 ; i < len; ){
//            for(int  j = 1; j <= 10; ){
//                while((arr[i] != j) && j <=10){
//                    j++;
//                }
//
//                int tempI = i+1;
//                int tempJ = j;
//
//                while(tempI < tempJ){
//                    System.out.print(tempI+" ");
//                }
//
//                i++;
//            }
//        }
//
//
//        // int lenValue = arr[len-1];
//        // if(lenValue < 10){
//        //     while(lenValue < 10){
//        //         System.out.print(lenValue+1+" ");
//        //         lenValue++;
//        //     }
//
//    }
//}
