package Golovach_courses.Lecture10.part1;


import java.util.Arrays;


public class app03 {
    public static void main(String[] args) throws Exception {
        char ch;
        ch = 1;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch = 273;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch = 4369;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));

       }
}
