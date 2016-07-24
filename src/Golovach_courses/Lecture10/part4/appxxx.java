package Golovach_courses.Lecture10.part4;


import java.util.Arrays;

public class appxxx {

    public static void main(String[] args) throws Exception {

        byte[] bytes = {70, 71, 72,-100,-101,-102};
        String str = new String(bytes, "UTF-8");
        String str1 = new String(bytes, "cp1251");
        System.out.println(str);
        System.out.println(str1);
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(new String(bytes,"UTF-8").toCharArray()));
        System.out.println(Arrays.toString(new String(bytes,"cp1251").toCharArray()));
        System.out.println( chars[0]);
        System.out.println( chars[1]);
        System.out.println( chars[2]);

    }

}
