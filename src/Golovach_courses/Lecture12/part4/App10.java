package Golovach_courses.Lecture12.part4;


import java.io.*;
import java.util.Arrays;

public class App10 {

    public static void main(String[] args) throws IOException {
        OutputStream dst = new ByteArrayOutputStream();
        dst = new LogOS("AFTER", dst);
        dst = new BufferedOutputStream(dst, 2);
        dst = new LogOS("BEFORE", dst);
        //dst = new GZIPOutputStream(dst);
        dst.write(1);
        dst.write(2);
        dst.write(3);
        dst.write(4);
        dst.write(5);
        dst.flush();

    }

}

class LogOS extends OutputStream {
    private final String name;
    private final OutputStream impl;

    LogOS(String name, OutputStream impl) {
        this.name = name;
        this.impl = impl;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(name + ":write(" + b + ")");
        impl.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println(name + ": write(" + Arrays.toString(b) + ")");
        impl.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println(name + ": write(" + Arrays.toString(b) + ", "+off+", "+len+") ");
        write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        impl.close();
    }

    @Override
    public void flush() throws IOException {
        System.out.println(name + ":flush");
        impl.flush();
    }
}