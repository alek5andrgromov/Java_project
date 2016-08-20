package Java_courses_ru.Полиморфизм.Граффическое_приложение;

import javax.swing.*;

/**
 * Created by rockx5g on 20.08.16.
 */
public class ShapeApplication {
    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}
