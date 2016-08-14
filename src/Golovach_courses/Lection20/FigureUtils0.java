package Golovach_courses.Lection20;

/**
 * Created by rockx5g on 13.08.16.
 */
public class FigureUtils0 {

    public static double perimeter(Rectangle rect) {
        return  2*(rect.getHeight() + rect.getWidth());
    }

    public static double perimeter(Circle circle) {
        return 2*Math.PI + circle.getRadius();
    }
}
