package Lecture8.part2;

import java.io.IOException;
import java.util.Date;

public class App01 {

    public static void main(String[] args) {
        try {
            close();

        } catch (IOException e) {

        }
    }

    public static void close() throws IOException {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(new Date(System.currentTimeMillis()-24*3600*1000));
        System.out.println(new Date(0));
    }

}
