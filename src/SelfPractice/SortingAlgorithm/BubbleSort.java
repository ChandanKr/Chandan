package SelfPractice.SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        int len = arr.length;

        for(int i = 0; i < len; i++){
            for(int j  = 0; j < len; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < len; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
