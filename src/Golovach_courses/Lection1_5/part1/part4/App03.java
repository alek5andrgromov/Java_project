package Golovach_courses.Lection1_5.part1.part4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App03 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("c:/tmp-1.txt");
            out = new FileOutputStream("c:/tmp-2.txt");
            out.write(in.read());
            out.flush();
        } finally {
            try {
                if (null != out) {
                    out.close();
                }
                } finally{
                    if (in != null) {
                        in.close();
                    }
                }
            }

    }
}