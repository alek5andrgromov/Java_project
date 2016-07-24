package Golovach_courses.Lecture10.part1;


public class app04 {
    public static void main(String[] args) {
        char ch0 = 55378;
        char ch1 = 56816;
        String str = new String(new char[] {ch0,ch1});
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.codePointCount(0,2));
        System.out.println(str.codePointAt(0));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
    }

}
