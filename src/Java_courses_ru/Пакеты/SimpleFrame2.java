package Java_courses_ru.Пакеты;

import javax.swing.*;

/**
 * Created by rockx5g on 14.08.16.
 */
public class SimpleFrame2 {
    public static void main(String[] args) {
        javax.swing.JFrame sf = new javax.swing.JFrame();
        sf.setTitle("Second windows program");
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sf.setBounds(200,150,500,400);
        sf.setVisible(true);
    }
}
