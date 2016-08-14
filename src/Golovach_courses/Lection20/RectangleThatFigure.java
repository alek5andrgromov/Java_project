package Golovach_courses.Lection20;

/**
 * Created by rockx5g on 13.08.16.
 */
public class RectangleThatFigure implements  Figure {
    private final double width;
    private final double height;

    public RectangleThatFigure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
