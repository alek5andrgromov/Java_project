package Golovach_courses.Lecture8.part2;

import java.io.IOException;
import java.sql.SQLException;

public class App00 {

    public static void main(String[] args) throws IOException, SQLException {

            close();


    }

    public static void close() throws IOException, SQLException {
            if (System.nanoTime() % 2 == 0) {
                throw new IOException();
            } else {
                throw new SQLException();
            }

    }

}


class TooMuchPrintersException extends Exception {
    private Printer[] printers;

    public TooMuchPrintersException(Printer[] printers) {
        this.printers = printers;
    }

    public Printer[] getPrinters() {
        return printers;
    }
}

class Printer {}