package Golovach_courses.Lectrure11.Part2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class App01 {

    public static void main(String[] args) throws IOException {

        InputStream src = new URL("http://google.com").openStream();
       // OutputStream dst = new FileOutputStream("c:/dom2.txt");
        copy(src, System.out);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read();
            if (data != -1) {
                dst.write(data);
            } else {
                return;
            }
        }
    }
}
