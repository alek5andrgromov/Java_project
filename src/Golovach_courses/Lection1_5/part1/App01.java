package Golovach_courses.Lection1_5.part1;

import java.io.IOException;
import java.sql.SQLException;


public class App01 {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            if (System.nanoTime() % 2 == 0) {
                throw new IOException();
            } else {
                throw new SQLException();
            }

        } catch (IOException | SQLException | NullPointerException e) {
            throw e;
//        Object ref = new int[] {0,1,2};
//        int k = ref[0];

        } catch (StackOverflowError e) {

        }
    }
}
