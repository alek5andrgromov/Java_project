package Java_courses_ru.Полиморфизм.Графическое_приложение_BorderLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rockx5g on 19.08.16.
 */
public class TriangleComponent extends JComponent {
    @Override
    protected void  paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(5,getHeight() - 10, getWidth()/2 - 5, 5);
        g.drawLine(getWidth()/2 -5, 5, getWidth() -10, getHeight() - 10);
        g.drawLine(getWidth(), getWidth() -10, 5,  getHeight() - 10);
    }
}
