package NewtonSchool.NSAssignments;

public class WC3_PairHateUsingString {
    public static void main(String[] args) {
        String str = "hhoowaaaareyyoouu";
        System.out.println(removePairDuplicates(str));
    }

    public static String removePairDuplicates(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(result.isEmpty() || result.charAt(result.length() - 1) != str.charAt(i)){
                result = result + str.charAt(i);
            }
            else if(result.charAt(result.length() - 1) == str.charAt(i)){
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
