package Golovach_courses.Lecture6;

/**
 * Created by RockX5G on 03.04.2016.
 */
public class AppXXX {
    public static void main(String[] args) {
        System.err.println("0>");
        try {
            f();
        } catch (RuntimeException e) {
            System.err.println("BAD ...");
        }
            System.err.println("0<");
    }

    private static void f() {
        System.err.println("  1>");
        g();
        System.err.println("  1<");
    }
    private static void g() {
        System.err.println("    2>");
        h();
        System.err.println("    2<");
    }

    private static void h() {
     //   return;
         throw new RuntimeException();
    }
}
