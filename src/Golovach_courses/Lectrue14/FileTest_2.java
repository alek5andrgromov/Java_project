package Golovach_courses.Lectrue14;


import java.io.File;
import java.io.IOException;

public class FileTest_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/tmp/XYZ");
        System.out.println("exists :" + file.exists());
        System.out.println("     createNewFile :" + file.mkdir());
        System.out.println("exists :" + file.exists());
//        System.out.println("     delete :" + file.delete());
//        System.out.println("exists :" + file.exists());

    }
}
