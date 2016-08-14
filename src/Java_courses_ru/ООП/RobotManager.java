package Java_courses_ru.ООП;

/**
 * Created by rockx5g on 09.08.16.
 */
public class RobotManager {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        // Установить значение поля Х у переменной r1
        r1.x = 99;
        r2.x = 123;
        // Напечатать поле Х
        System.out.println("r1.x = " + r1.x);
        System.out.println("r2.x = " + r2.x);


        //Создаем объект класса Robot
        Robot robot = new Robot();
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
        //Курс 90 градусов - самый правильный способ
        // но пока остановимся на нем
        robot.course = 90;

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
        // Курс 45 градусов
        robot.course = 45;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();


    }
}
