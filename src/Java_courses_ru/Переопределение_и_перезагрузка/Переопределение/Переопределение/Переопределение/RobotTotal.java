package Java_courses_ru.Переопределение_и_перезагрузка.Переопределение.Переопределение.Переопределение;

/**
 * Created by rockx5g on 14.08.16.
 */
public class RobotTotal extends  Java_courses_ru.ООП.NewRobot{
    private  double totalDistance = 0;

    public RobotTotal() {
        super(0,0);
    }
    public RobotTotal(double x, double y) {
        super(x,y);
    }

    @Override
    public  void  forward(int Distance) {
        super.forward(Distance);
        totalDistance += Distance;
    }

    public double getTotalDistance() {
        return  totalDistance;
    }
}
