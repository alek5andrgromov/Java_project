package Lectrue14;

import java.io.File;
import java.io.IOException;

public class FileTest_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/tmp/XYZ/");
        initDir(file);
        fillDir(file,"a.txt","b.txt","c.txt");
     //   nalveDeleteDir(file);
       delete(file);
    }

     private static void initDir(File file) throws IOException {
        if (!file.exists()) {
            if (!file.mkdir()) {
                throw new IOException("Can not create directory " + file.getName());
            }
        }
    }

    private static void fillDir(File dir, String ... fileNames) throws IOException {
        for (String fileName : fileNames) {
            if (!new File(dir, fileName).createNewFile()) {
                throw new IOException("Can not create file " + fileName);
            }
        }
    }

    private static void nalveDeleteDir(File dir) throws IOException {
        if (!dir.delete()) {
            throw new IOException("Can not delete directory " + dir.getName());
        }
    }

    private static void delete(File root) throws IOException {
        if (root.isDirectory()) {
            File[] files = root.listFiles();
            for (File file : files) {
                delete(file);
            }
        }
        root.delete();
    }
}
