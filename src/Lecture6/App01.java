package Lecture6;

/**
 * Created by RockX5G on 02.04.2016.
        */
public class App01 {
    public static void main(String[] args) {
        int area = area(-10, 20);
        if (area == -1) {
            System.out.println("Bad ...");
        } else {
            System.out.println("Area = " + area);
        }
    }

        public static int area(int width, int height) {
            if (width < 0 || height <0) {
                return -1;
            }
        return width * height;
        }
    }

