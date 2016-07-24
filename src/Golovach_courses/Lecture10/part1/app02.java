package Golovach_courses.Lecture10.part1;


import java.util.Arrays;

/**
 * Created by RockX5G on 02.05.2016.
 */
public class app02 {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString("A".getBytes("UTF-8")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16BE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16LE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32BE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32LE")));

       }
}
