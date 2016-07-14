
public class App21fib {
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

        int result =  (arg < 2 ) ? 1 : fib(arg - 2) + fib(arg -1);
        System.out.println(" " + arg);
        return result;
    }
}
