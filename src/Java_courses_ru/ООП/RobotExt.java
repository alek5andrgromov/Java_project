package Java_courses_ru.ООП;

/**
 * Created by rockx5g on 13.08.16.
 */
public class RobotExt extends NewRobot {

    public RobotExt(double x, double y, double course) {
        super(x,y);
        setCourse(course);
    }

    public void back (int distance) {
        forward(-distance);
    }

}
