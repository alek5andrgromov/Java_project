package Stepic;

/**
 * Created by rockx5g on 09.07.16.
 */
public class PrimitiveType {

    public static void main(String[] args) {
      long d = typeprim(843, 0, 5);
        System.out.println("d = " + d);
    }

    public static long typeprim(long a, long b, int c) {

        long x = 100_000_000_000L;

        x = x % a;

        long b1 = x >> b;

        int c1 = 100 / c;

        long d = b1 | c1;

        return d;
    }
}
