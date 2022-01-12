package SelfPractice;

public class simpleEqn {
    static int equationSum(int N)
    {
        //Enter your code here
        int result = 0;
        for( int i = 1; i  <= N; i++){
            result = result + ((i+1)^2 - ((3*i)+1) + i);

        }
        return result;
    }
    public static void main(String[] args) {
        int N = 2;
        System.out.println(equationSum(N));
    }
}
