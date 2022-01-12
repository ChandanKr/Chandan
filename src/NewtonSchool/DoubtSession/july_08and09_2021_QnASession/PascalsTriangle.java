package NewtonSchool.DoubtSession.july_08and09_2021_QnASession;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;

        //currentTerm = ((previousTerm) * (n - r + 1)) / i
        int previousTerm = 1;
        System.out.print(previousTerm+" ");
        for(int i = 1; i < n; i++) {
            int currentTerm = (previousTerm * (n - i + 1)) / i;
            System.out.print(currentTerm+" ");
            previousTerm = currentTerm;
        }
        System.out.println("1");
    }
}
