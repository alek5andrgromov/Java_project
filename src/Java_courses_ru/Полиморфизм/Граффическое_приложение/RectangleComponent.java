package Java_courses_ru.Полиморфизм.Граффическое_приложение;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rockx5g on 19.08.16.
 */
public class RectangleComponent extends JComponent {
    @Override
    protected void  paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5,5,getWidth() - 10, getHeight() - 10);

    }
}
