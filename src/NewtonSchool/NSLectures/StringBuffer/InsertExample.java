package NewtonSchool.NSLectures.StringBuffer;

public class InsertExample {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("I Java");
        string.insert(2, "like ");
        System.out.println(string);
    }
}
