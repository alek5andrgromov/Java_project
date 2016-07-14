package Lecture6;

/**
 * Created by RockX5G on 02.04.2016.
 */
public class App02 {
    public static void main(String[] args) {
        int area = area(-10, 20);
        System.out.println("Area = " + area);
    }

    public static int area(int width, int height) {
        if (width < 0 || height <0) {
            System.out.println("Incorrect arguments.");
  //          System.exit(0);
        }
        return width * height;
    }
}
