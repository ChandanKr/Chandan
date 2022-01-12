package NewtonSchool.NSAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class twoDMatrix_ABooleanMatrixProblem {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for(int a = 1; a <= testcases; a++){
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int[][] arr = new int[rows][columns];

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    arr[i][j] = sc.nextInt();
                    if(arr[i][j] == 1){
                        Arrays.fill(arr[i], 1);
                        sc.nextLine();
                        break;
                    }
                }
            }

/*        	for(int i = 0; i < rows; i++){
            	for(int j = 0; j < columns; j++){
                	arr[i][j] = sc.nextInt();
            	}
        	}

        	for(int i = 0; i < rows; i++){
            	for(int j = 0; j < columns; j++){
                	if((arr[i][j] == 1)){
                        for(j = 0; j < columns; j++){
                            arr[i][j] = 1;
                        }
						break;
               		}
            	}
        	}
*/

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
