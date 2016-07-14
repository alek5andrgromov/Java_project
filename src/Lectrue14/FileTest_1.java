package Lectrue14;


import java.io.File;
import java.io.IOException;

public class FileTest_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:/tmp/ABC.txt");
        System.out.println("exists :" + file.exists());
        System.out.println("     createNewFile :" + file.createNewFile());
        System.out.println("exists :" + file.exists());
        System.out.println("     delete :" + file.delete());
        System.out.println("exists :" + file.exists());

    }
}
