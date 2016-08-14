package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 07.08.16.
 */
public class LoopDoTwo {
         public static void main(String[] arg) {
            int count = 10;
            int i = 0;
            do {
                System.out.print("*");
            } while (++i < count);   // Вот здесь наш оператор ++
            System.out.println();
    }
}
