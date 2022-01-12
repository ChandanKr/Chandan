//INCOMPLETE
package NewtonSchool.NSAssignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WC1_SimpleRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        Integer[] X = new Integer[len];
        Integer[] Y = new Integer[len];
        for(int i = 0; i < len; i++){
            X[i] = sc.nextInt();
        }

        for(int j = 0; j < len; j++){
            Y[j] = sc.nextInt();
        }

        printAreaOfSmallestRect(X, Y, len);
    }

    public static void printAreaOfSmallestRect(Integer[] X, Integer[] Y, int len) {
        int Xmax = 0, Xmin = 0, Ymax = 0, Ymin = 0;
        if(!areElementSame(X) && !areElementSame(Y)){
            Xmax = Collections.max(Arrays.asList(X));
            Xmin = Collections.min(Arrays.asList(X));

            Ymax = Collections.max(Arrays.asList(Y));
            Ymin = Collections.min(Arrays.asList(Y));
        }
        else if(areElementSame(X) && !areElementSame(Y)){
            Xmax = Collections.min(Arrays.asList(Y));
            Xmin = Collections.min(Arrays.asList(X));

            Ymax = Collections.min(Arrays.asList(Y));
            Ymin = Collections.min(Arrays.asList(X));
        }
        else if(!areElementSame(X) && areElementSame(Y)){
            Xmax = Collections.max(Arrays.asList(X));
            Xmin = Collections.min(Arrays.asList(Y));

            Ymax = Collections.min(Arrays.asList(X));
            Ymin = Collections.min(Arrays.asList(Y));
        }
        else if(areElementSame(X) && areElementSame(Y)){
            Xmax = Collections.max(Arrays.asList(Y));
            Xmin = Collections.min(Arrays.asList(X));

            Ymax = Collections.max(Arrays.asList(Y));
            Ymin = Collections.min(Arrays.asList(X));
        }

//        Xmax = Collections.max(Arrays.asList(X));
//        Xmin = Collections.min(Arrays.asList(Y));
//
//        Ymax = Collections.min(Arrays.asList(X));
//        Ymin = Collections.min(Arrays.asList(Y));

        System.out.println("Xmin: "+Xmin);
        System.out.println("Xmax: "+Xmax);
        System.out.println("Ymin: "+Ymin);
        System.out.println("Ymax: "+Ymax);

        System.out.println("{" + Xmin + ", " + Ymin + "}");
        System.out.println("{" + Xmin + ", " + Ymax + "}");
        System.out.println("{" + Xmax + ", " + Ymax + "}");
        System.out.println("{" + Xmax + ", " + Ymin + "}");

        int length = (Xmax - Xmin);
        int breadth = (Ymax - Ymin);
        int area = (length * breadth);
        System.out.println(area);
    }

    public static boolean areElementSame(Integer arr[]){
        Integer first = arr[0];
        for (int i=1; i<arr.length; i++)
            if (arr[i] != first)
                return false;
        return true;
    }
}
