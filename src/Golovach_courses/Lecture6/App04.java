package Golovach_courses.Lecture6;

/**
 * Created by RockX5G on 02.04.2016.
 */

public class App04 {
    public static void main(String[] args) {
        int area = area(-10, 20);
        System.out.println("Area = " + area);
    }

    public static int area(int a, int b) {
        if (a < 0 || b <0) {
            throw new IllegalArgumentException("a<0 || b<0 == true,a = " + a + ",b = " + b);
        //throw прекращает выполнение метода
        }
        return a * b;
    }

}
