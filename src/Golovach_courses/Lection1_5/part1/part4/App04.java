package Golovach_courses.Lection1_5.part1.part4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App04 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("c:/tmp-1.txt");
             FileOutputStream out = new FileOutputStream("c:/tmp-2.txt");) {
            out.write(in.read());
            out.flush();
        }
    }
}