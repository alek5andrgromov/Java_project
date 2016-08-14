package Golovach_courses.Lection20;

/**
 * Created by rockx5g on 13.08.16.
 */
public class CircleThatFigure implements Figure{
    private final double radius;

    public CircleThatFigure(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
