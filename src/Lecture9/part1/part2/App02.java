package Lecture9.part1.part2;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by RockX5G on 24.04.2016.
 */
public class App02 {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            if (System.nanoTime() % 2 == 0) {
                throw new IOException();
            } else {
                throw new SQLException();
            }

        } catch (IOException | SQLException e) {
            SQLException eee = (SQLException)e;
            throw e;
//        Object ref = new int[] {0,1,2};
//        int k = ref[0];

        }
    }
}
