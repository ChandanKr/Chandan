package NewtonSchool.NSAssignments;


import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for( int j = 0; j < N; j++){
            A[j] = sc.nextInt();
        }

        int low = 0;
        int high = N-1;
        int cnt = 0;

        while(low < high){
            while(A[low] == 0 && low < high)
                low++;

            while (A[high] == 1 && low < high)
                high--;

            if (low < high) // swapping operation
            {
                A[low] = 0;
                A[high] = 1;
                low++;
                high--;
                cnt++;
            }
        }
        System.out.println(cnt);
        // printArray(A);
    }

    static void printArray(int[] A){
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.print(" ");
    }
}