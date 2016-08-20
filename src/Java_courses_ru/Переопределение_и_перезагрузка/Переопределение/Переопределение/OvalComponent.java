package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rockx5g on 14.08.16.
 */
public class OvalComponent extends JComponent {

    @Override
    protected  void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5,5,getWidth() - 10, getHeight() -10);

    }
}
