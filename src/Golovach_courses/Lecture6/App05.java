package Golovach_courses.Lecture6;

/**
 * Created by RockX5G on 02.04.2016.
 */
import java.io.IOException;
import java.util.IllegalFormatException;

public class App05 {
    public static void main(String[] args) throws IOException {
        try {
            int area = area(-10, 20);
            System.out.println(area);
        } catch (IllegalFormatException e) {
            System.out.println("bad ...");
        }
        System.out.println("next" );
    }

    public static int area(int a, int b) {
        if (a < 0 || b <0) {
            throw new IllegalArgumentException("a<0 || b<0 == true,a = " + a + ",b = " + b);
            //throw - прекращает выполнение метода
        }
        return a * b;
    }
}
