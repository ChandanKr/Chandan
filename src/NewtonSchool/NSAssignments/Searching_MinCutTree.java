package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class Searching_MinCutTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int low = 1;

        int high = k;
        int mid;

        //System.out.println(low + " " + high);
        while(low <= high){
            mid = low + (high  - low) / 2;

            //wood collected
            int sum = 0;
            for(int i = 0; i < n; i++){
                int wood_collected = arr[i] - mid;
                if (wood_collected >=  0) // collect only positive numbers
                    sum = sum + wood_collected;
            }

            if(sum == k)
                break; //System.out.print(mid);
            else if(sum < k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.print(low) ;
    }
}
