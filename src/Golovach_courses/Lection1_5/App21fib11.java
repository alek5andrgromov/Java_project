package Golovach_courses.Lection1_5;

public class App21fib11 {
    public static void main(String[] args) {
        fib(5);
     //   for (int k = 0; k < 10; k++) {
     //       System.out.println("fib(" + k + ") = " + fib(k));
        }


    public static int fib(int arg) {
      /*  if (arg == 0) {
            return 1;
        } else if (arg == 1) {
            return 1;
        } else {
            return fib(arg - 2) + fib(arg -1);
        }*/

        return  (arg < 2 ) ? 1 : fib(arg - 2) + _(arg) + fib(arg -1);
    }
    //печатаем слевой функции вправую
    public static int _(int arg) {
        System.out.println(" " + arg);
        return 0;
    }
}
