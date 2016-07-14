import java.lang.Integer;
import java.lang.String;
import java.lang.System;

public class intvalue01 {
    public static void main(String[] args) {
        int value0 = Integer.valueOf("123");
        System.out.println(value0);

        int value1 = Integer.valueOf("abc");
        System.out.println(value1);
    }
}
