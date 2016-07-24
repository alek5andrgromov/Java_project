package Golovach_courses.Lecture12.part4;


import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;

public class App30 {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        OutputStream dst = new BufferedOutputStream(buff, 8*1024);
        dst = new DeflaterOutputStream(dst);
        DataOutput out = new DataOutputStream(dst);
        for (int k = 0; k < 1000_000; k++) {
            out.writeDouble(k % 2 == 0 ? 0.5 : 1.5);
        }
        dst.flush();
        dst.close();
        byte[] rawData = buff.toByteArray();
        System.out.println(rawData.length);
        //System.out.println(Double.doubleToLongBits(1.0));
        //InputStream in = new ByteArrayInputStream(rawData);
        DataInput src = new DataInputStream(
                new GZIPInputStream(
                        new BufferedInputStream(
                                new ByteArrayInputStream(rawData))));
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readInt());
        System.out.println("'"+src.readUTF()+"'");

    }

}
