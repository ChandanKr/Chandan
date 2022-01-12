//INCOMPLETE :)


//        standard input/output: 1s/128000 kB
//
//        Hawkeye has been assigned to eliminate n monsters, the ith of which is of type ai. In one move, he can do either of the following:
//
//        i. Shoot down atmost any k monsters. In other words, he can shoot down any set of monsters such that the size of that set is smaller than or equal to k.
//        ii. Shoot down all monsters of any one type.
//
//        Find the minimum number of moves it will take him to shoot down all the monsters.
//
//        Input
//        The first line contains one integer t — the number of test cases. Each test case consists of two lines.
//        The first line contains two space-separated integers n and k.
//        The second line contains n space-separated integers a1, a2 . . . an.
//
//        Constraints:
//        1 ≤ t ≤ 105
//        1 ≤ k ≤ n ≤ 105
//        1 ≤ ai ≤ n
//        The sum of n over all test cases does not exceed 105.
//
//        Output
//        For each test case, print a single value - the minimum number of moves required.
//
//        Example
//
//        Sample input
//        3
//        7 2
//        1 2 3 4 4 4 4
//        5 3
//        1 2 3 1 2
//        5 3
//        5 5 5 5 5
//
//        Sample output
//        3
//        2
//        1
//
//        Explanation:
//        For the first test case, the minimum moves required is 3. One way to do so is that Hawkeye can first shoot monsters 1 and 2 in one move using the second operation.
//        Then he can shoot down all monsters of type 4 using the first operation, followed by shooting monster 3 by either method.




package NewtonSchool.NSHackathons.NSGrandCodingContest2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Archery {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        for(int i = 0; i < n-1; ){
            if(arr[i] == arr[i+1]){
                if(arr[i+1] == arr[n-1]){
                    count++;
                    break;
                }

                while(arr[i] == arr[i+1] && i < n-1){
                    i++;
                }
                count++;
            }
            else{
                count++;
                i += k;
            }
        }
        System.out.println(count);
    }*/

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i = 0;i<n;i++) {
                int temp = sc.nextInt();
                if(hm.containsKey(temp)) hm.put(temp,hm.get(temp) +1);
                else hm.put(temp,1);
            }
            int count = 0;
            for(Integer key : hm.keySet()){
                if(hm.get(key) > k){
                    count++;
                    n-= hm.get(key);
                }
            }
            count += ((n+(k-1))/k);
            System.out.println(count);
            hm.clear();
        }
    }
}
