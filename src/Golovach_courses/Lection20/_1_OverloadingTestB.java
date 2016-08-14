package Golovach_courses.Lection20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rockx5g on 13.08.16.
 */
public class _1_OverloadingTestB {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        figures.add(new CircleThatFigure(1));
        figures.add(new RectangleThatFigure(2, 1));

        for (Figure figure : figures) {
            System.out.println("perimeter: " + FigureUtils2.perimeter(figure));
        }
    }
}
