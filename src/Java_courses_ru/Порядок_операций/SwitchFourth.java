package Java_courses_ru.Порядок_операций;

/**
 * Created by rockx5g on 07.08.16.
 */
public class SwitchFourth {

    public static void main(String[] arg) {
        int number= 1;

        switch(number) {
            case 1:
            case 2:
                System.out.println("One or Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Unknown");
        }

    }
}
