package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение;

import javax.swing.JFrame;
/**
 * Created by rockx5g on 14.08.16.
 */
public class OvalFrame extends JFrame{
    public OvalFrame() {
        OvalComponent oc = new OvalComponent();
        add(oc);
        setBounds(200,200,350,250);

    }
}
