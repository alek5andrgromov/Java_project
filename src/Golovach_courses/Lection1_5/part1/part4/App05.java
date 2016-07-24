package Golovach_courses.Lection1_5.part1.part4;

import java.io.IOException;

public class App05 {
    public static void main(String[] args) throws IOException {
        Error ex = new Error("A");
        ex.addSuppressed(new Error("B"));
        ex.addSuppressed(new Error("C"));
        ex.addSuppressed(new Error("D"));
        ex.addSuppressed(new Error("E"));
        throw ex;

        }

    }
