package Java_courses_ru.Полиморфизм.Графическое_приложение_NullLayout;

import javax.swing.*;
import java.awt.*;


/**
 * Created by rockx5g on 19.08.16.
 */
public class ShapeFrame extends JFrame{
    public ShapeFrame() {
        // Устанавливаем LayoutManager в виде таблицы
        // размерами 2 строки на 3 столбца
        setLayout(null);
        OvalComponent oval = new OvalComponent();
        RectangleComponent rect = new RectangleComponent();
        TriangleComponent triangle = new TriangleComponent();
        oval.setBounds(100,50,100,150);
        rect.setBounds(100,300,100,150);
        triangle.setBounds(100,500,100,150);

        // Создаем и "укладываем" на форму компоненты разных классов
        add(oval);
        add(rect);
        add(triangle);



        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 450, 350);
    }
}
