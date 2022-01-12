package NewtonSchool.DoubtSession.july_10_2021_functions.AccessSpecifiers;

public class AccessSpecifiersExample {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        a = 10;
        b = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        AccessSpecifierAnotherExample.display();
    }
}
class AccessSpecifierAnotherExample {
    static void display() {
        System.out.println("In display()");
        //System.out.println(AccessSpecifierExample.a); //not allowed in same file as 'a' is private
    }
}
