package Java_courses_ru.Полиморфизм.LayoutManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rockx5g on 20.08.16.
 */
class FlowLayoutTest extends JFrame{
    public FlowLayoutTest() {
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        for (int k = 0; k < 50; k++) {
            getContentPane().add(new JButton("" + k));
        }
        setBounds(10, 100, 1000, 1000);
    }

    public static void main(String[] args) {
        FlowLayoutTest flt = new FlowLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
