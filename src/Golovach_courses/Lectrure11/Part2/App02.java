package Golovach_courses.Lectrure11.Part2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class App02 {

    public static void main(String[] args) throws IOException {

        InputStream src = new URL("http://google.com").openStream();
       // OutputStream dst = new FileOutputStream("c:/dom2.txt");
        copy(src, System.out);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[64*1024];
        while (true) {
            int count = src.read(buff);
            if (count != -1) {
                dst.write(buff, 0, count);
            } else {
                return;
            }
        }
    }
}
