package Golovach_courses.Lecture13.Lab;


import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestBAOS {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        buff.write(0);
        buff.write(new byte[] {1,2,3});
        buff.write(new byte[] {0,0,0,4,5,6,0,0,0});

        buff.toByteArray();


    }
}
