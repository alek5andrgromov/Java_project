package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 24.07.16.
 */
public class LoopForFive {

    public static void main(String[] args) {

            int count = 10;
            for (int i = 0; i < count; i++) {
                for (int k = 0; k < i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    
}
