package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 07.08.16.
 */

public class CheckFirst {

    public static void main(String[] arg) {
        int count = 10;

        int i = 0;
        while (i++ < count) {
            System.out.print("*");
        } while (++i < count);

        System.out.println();
    }
}
