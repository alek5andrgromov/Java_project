package Lecture12.part4;


import javax.xml.crypto.Data;
import java.io.*;
import java.util.zip.DeflaterOutputStream;


public class App31 {

    public static void main(String[] args) throws IOException {
        OutputStream buff = new FileOutputStream("c:/XXXYYY.txt");
  //      OutputStream dst = new BufferedOutputStream(buff,128);
        DataOutputStream out = new DataOutputStream((buff));

        
        long start = System.currentTimeMillis();
        
        for (int k = 0; k < 1000_000; k++) {
            out.writeDouble(k % 2 == 0 ? 0.5 : 1.5);
        }
        
     //   dst.flush();
    //    dst.close();
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }

}
