package Java_courses_ru.Полиморфизм.LayoutManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rockx5g on 20.08.16.
 */
public class GridLayoutTest extends JFrame {
    public GridLayoutTest()
    {
        getContentPane().setLayout(new GridLayout(4,3, 10, 10));
        for(int k=0; k<12; k++) {
            getContentPane().add(new JButton(""+k));
        }

        setBounds(100,100,400,300);
    }

    public static void main(String[] args)
    {
        GridLayoutTest flt = new GridLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
