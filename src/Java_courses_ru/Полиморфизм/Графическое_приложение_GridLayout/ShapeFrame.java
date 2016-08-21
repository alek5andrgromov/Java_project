package Java_courses_ru.Полиморфизм.Графическое_приложение_GridLayout;

import javax.swing.*;
import java.awt.*;


/**
 * Created by rockx5g on 19.08.16.
 */
public class ShapeFrame extends JFrame{
    public ShapeFrame() {
        // Устанавливаем LayoutManager в виде таблицы
        // размерами 2 строки на 3 столбца
        setLayout(new GridLayout(2, 6, 10, 10));

        // Создаем и "укладываем" на форму компоненты разных классов
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());


        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 450, 350);
    }
}
