package Golovach_courses.Lectrue14;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class FileTest_0 {
    public static void main(String[] args) {
        File file = new File("c:/tmp"); // TODO: c:/tmp_xxx
        System.out.println(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        })));

    }

}
