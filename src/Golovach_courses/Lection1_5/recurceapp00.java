package Golovach_courses.Lection1_5;

public class recurceapp00 {
    public static void main(String[] args) {
        f(1);
    }

    public static void f(int arg) {
        System.out.print(" " + arg);
        if (arg < 7) {
            f(2*arg);
        }
    }
}
