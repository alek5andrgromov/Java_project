package Lectrue14;

import java.io.*;
import java.nio.channels.FileChannel;

/**
Копирование файлов
 */
public class FileTest_7 {
    private static final int COPY_BUTTER_SIZE = 64 * 1024;

    public static void main(String[] args) throws IOException {

//        copyByStreamOld(
//                new File("c/tmp/work.png"), new File("c/tmp/work1.png"));
        copyByStreamNew(
                new File("c/tmp/work.png"), new File("c/tmp/work1.png"));

//        copyByChannels(
//                new File("c/tmp/work.png"), new File("c/tmp/work1.png"));

    }


    public static void copyByStreamOld(File fileSrc, File fileDst) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(fileSrc);
            out = new FileOutputStream(fileDst, false);
            byte[] buff = new byte[COPY_BUTTER_SIZE];
            int count;
            while ((count = in.read(buff)) != -1) {
                out.write(buff, 0, count);
            }
            out.flush();
        } catch (IOException e) {
            throw new IOException("Exception when copy file " + fileSrc + " to file = " + fileDst);
        } finally {
            closeQuietly(in);
            closeQuietly(out);
        }
    }

    private static void closeQuietly(FileOutputStream out) {
        if (out != null) {
            try {
                out.close();
            } catch (IOException ignore) {/*NOP*/}
        }
    }

    private static void closeQuietly(FileInputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {/*NOP*/}
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[COPY_BUTTER_SIZE];
        int count;
        while((count=in.read(buff))!=-1)
        {
            out.write(buff, 0, count);
        }
        out.flush();
}
    public static void copyByStreamNew(File fileSrc, File fileDst) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(fileSrc);
            out = new FileOutputStream(fileDst, false);
            byte[] buff = new byte[COPY_BUTTER_SIZE];
            int count;
            while ((count = in.read(buff)) != -1) {
                out.write(buff, 0 , count);
            }
            out.flush();
        } catch (IOException e) {
            throw new IOException("Exception when copy file " + fileSrc + " to file = " + fileDst);
        } finally {
            closeQuietly(in);
            closeQuietly(out);
        }
    }

    public static void copyByChannels(File fileSrc, File fileDst) throws  IOException {
        try (FileInputStream in = new FileInputStream(fileSrc);
            FileOutputStream out = new FileOutputStream(fileDst, false)) {
            FileChannel inChannel = in.getChannel();
            FileChannel outChannel = out.getChannel();
            long count = 0;
            long size = inChannel.size();
            while (count < size) {
                long currentPosition = count;
                long bytesLeft = size - count;
                count *= outChannel.transferFrom(inChannel, currentPosition, bytesLeft);
            }

        } catch (IOException e) {
            throw new IOException("Exception when copy file " + fileSrc + "to file " + fileDst);
        }
    }
}
