//INCOMPLETE - "Wrong Answer" in 4 testcases

package NewtonSchool.NSAssignments;

import java.util.Scanner;

public class WC3_HappyStrings {
    static void StringCount(String[] strArr, int n){
        int ans = 0;
        int notHappyString = 0;
        int isHappyString = 0;
        notHappyString = n;
        int[] maxArr = new int[27];
        int[] minArr = new int[27];
        for(int i = 0; i < 27; i++){
            minArr[i] = 0;
            maxArr[i] = 0;
        }
        for(int i = 0; i < n; i++){
            int max = -1;
            int min = 100;
            String s = strArr[i];
            boolean isHappy = false;
            for(int j = 0; j < s.length(); j++){
                int x = s.charAt(j) - 'a'; //using ASCII concept here
                if(x > max){
                    max = x;
                }
                if(x < min){
                    min = x;
                }
                if(x>min){
                    isHappy = true;
                    break;
                }
            }
            if(isHappy == false){
                maxArr[max]++;
                minArr[min]++;
            }
            if(isHappy == true){
                notHappyString--;
                isHappyString++;
            }
        }
        ans = (isHappyString*isHappyString) + 2*(isHappyString*notHappyString);
        int notHappyConsider = notHappyString;
        for(int i = 0; i < 26; i++){
            notHappyConsider = notHappyConsider - maxArr[i];
            ans += minArr[i] * notHappyConsider;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i = 0; i < n; i++){
            strArr[i] = sc.next();
        }
        StringCount(strArr, n);
    }
}
