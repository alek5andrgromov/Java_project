package Golovach_courses.Lecture10.part1;

import java.io.UnsupportedEncodingException;

/**
 * Created by RockX5G on 02.05.2016.
 */
public class app01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("ЭЮЯ".getBytes("UTF-8").length);
        System.out.println("ЭЮЯ".getBytes("cp1251").length);
       }
}
