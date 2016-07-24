package Golovach_courses.Lecture12.part1;


import java.io.*;

import java.util.zip.GZIPOutputStream;

public class App00 {

    public static void main(String[] args) throws IOException {
        OutputStream dst = new FileOutputStream("c:/tmp.bin");
        dst = new BufferedOutputStream(dst);
        dst = new GZIPOutputStream(dst);



    }

}
