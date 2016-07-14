package Lecture10.part1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by RockX5G on 02.05.2016.
 */
public class app00 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("A".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-16").length);
       }
}
