package Lecture13.Lab;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
    public static void copyCCLeanZerosByByte(InputStream in, OutputStream out) throws IOException {
        int k;
        try {
            while ((k = in.read()) != -1) {
                if (k !=0) {
                    out.write(k);
                }
            }
        } catch (IOException e) {
            throw new IOException("Some exception when copy data from ");

        } finally {
         ///   closeQuietly(in);
         //   closeAndFlushQuietly(out);
        }
    }




}
