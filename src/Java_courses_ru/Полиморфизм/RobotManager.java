package Java_courses_ru.Полиморфизм;

import Java_courses_ru.ООП.NewRobot;
import Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение.Переопределение.RobotTotal;

/**
 * Created by rockx5g on 19.08.16.
 */

public class RobotManager {

    public static void main(String[] args) {
        // Первое проявление полиморфизма - ссылке на класс-предок
        // можно присвоить класс-потомок
        NewRobot robot = new RobotTotal(0, 0);

        robot.forward(20);
        robot.setCourse(90);
        robot.forward(20);
        robot.setCourse(90);
        robot.forward(50);
        // Напечатать координаты
        robot.printCoordinates();
        // Напечатать общую дистанцию уже не получится
        // компилятор выдает ошибку
        //System.out.println(robot.getTotalDistance());

    }
}
