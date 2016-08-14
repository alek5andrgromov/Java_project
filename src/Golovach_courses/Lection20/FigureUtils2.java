package Golovach_courses.Lection20;

/**
 * Created by rockx5g on 13.08.16.
 */
public class FigureUtils2 {
    public static double perimeter(Rectangle rect) {
        return  2*(rect.getHeight() + rect.getWidth());
    }

    public static double perimeter(Circle circle) {
        return 2*Math.PI + circle.getRadius();
    }


    public static String perimeter(Figure figure) {
        if (figure instanceof RectangleThatFigure) {
            return perimeter((RectangleThatFigure) figure);
        } else  if (figure instanceof CircleThatFigure) {
            return perimeter((CircleThatFigure) figure);
        } else {
            throw new Error("Bad type. Only CircleThatFigure + RectangleThatFigure ");
        }
    }
}
