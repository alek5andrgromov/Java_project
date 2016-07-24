package Golovach_courses.Lection1_5;

import java.util.Arrays;

/**
 * Created by RockX5G on 22.03.2016.
 */
public class App00001 {
    public static void main(String[] args) {
        int[] x = {0,1,2};
        int[] y = x;
        x[0] = 10;
        System.out.println("x: " + Arrays.toString(x));
        System.out.println("x: " + Arrays.toString(y));
    }


}
