package Java_courses_ru.Полиморфизм.Графическое_приложение_BorderLayout;

import javax.swing.*;
import java.awt.*;


/**
 * Created by rockx5g on 19.08.16.
 */
public class ShapeFrame extends JFrame{
    public ShapeFrame() {
        // Устанавливаем LayoutManager в виде таблицы
        // размерами 2 строки на 3 столбца
        setLayout(new BorderLayout());

        // Создаем и "укладываем" на форму компоненты разных классов
        add(new OvalComponent(),BorderLayout.NORTH);
        add(new RectangleComponent(), BorderLayout.SOUTH);
        add(new TriangleComponent(), BorderLayout.WEST);
       add(new OvalComponent(), BorderLayout.EAST);
       add(new RectangleComponent(), BorderLayout.CENTER);
       add(new TriangleComponent(), BorderLayout.AFTER_LAST_LINE);


        // Устанавливаем координаты и размеры окна
        setBounds(100, 100, 400, 300);
    }
}
