package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение.Переопределение;

/**
 * Created by rockx5g on 14.08.16.
 */
public class RobotManager {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Test Robot 1");
        Robot robot2 = new Robot("Test Robot 2");
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
    }
}
