//COMPLETED

package NewtonSchool.NSAssignments;

import java.util.HashMap;
import java.util.Scanner;

public class DSAContestPlacementPreparation_DistinctVals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumOperations(arr, len));
    }

    public static int minimumOperations(int[] arr, int len)
    {

        // Hash-table to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Increase the frequency of elements
        for (int i = 0; i < len; i++)
        {
            if (map.get(arr[i]) != null)
            {
                int x = map.get(arr[i]);
                map.put(arr[i], ++x);
            }
            else
                map.put(arr[i], 1);
        }

        int count = 0;

        // Traverse in the map to sum up the (occurrences-1)
        // of duplicate elements
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > 1)
            {
                count += (entry.getValue() - 1);
            }
        }

        return count;
    }
}
