package Golovach_courses.Lection1_5;

import java.util.Arrays;

public class ArrayInverterTest {
    public static void main (String[] args) {
        testInvert(new int[] {});
        testInvert(new int[] {0});
        testInvert(new int[] {0, 1});
        testInvert(new int[] {0,1,2,3,4});
    }
    private static void testInvert(int[] arr) {
        System.out.println(Arrays.toString(arr)+ "-> ");
        ArrayInverter.invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
