package Java_courses_ru.Полиморфизм.LayoutManager;

import javax.swing.*;

/**
 * Created by rockx5g on 20.08.16.
 */
public class BoxLayoutTest extends JFrame{

    public BoxLayoutTest()
    {
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for(int k=0; k<12; k++) {
            getContentPane().add(new JButton(""+k));
        }

        setBounds(100,100,700,300);
    }

    public static void main(String[] args)
    {
        BoxLayoutTest flt = new BoxLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }

}
