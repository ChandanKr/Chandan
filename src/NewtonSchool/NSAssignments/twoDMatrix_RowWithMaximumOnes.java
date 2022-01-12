package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class twoDMatrix_RowWithMaximumOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0, currentMax = 0, iPosition=0;
        for(int i = 0; i < rows; i++){
            if(arr[i][0] == 1){
                iPosition = i;
                break;
            }
            else{
                for(int j = 1; j < columns; j++){

                    if(arr[i][j] == 1){
                        currentMax = columns - j;
                    }

                    if(max < currentMax){
                        max = currentMax;
                        iPosition = i;
                        break;
                    }
                }
            }
        }
        System.out.println(iPosition);
    }
}
