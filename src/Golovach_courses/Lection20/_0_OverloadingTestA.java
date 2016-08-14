package Golovach_courses.Lection20;

import java.awt.*;

/**
 * Created by rockx5g on 13.08.16.
 */
public class _0_OverloadingTestA {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rect = new Rectangle(2,1);

        System.out.println("perimeter: " + FigureUtils0.perimeter(circle));

        System.out.println("perimeter: " + FigureUtils0.perimeter(rect));
    }
}
