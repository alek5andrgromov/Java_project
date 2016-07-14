package Lecture13.Lab;
// Задача. Закачивала страницу из Интернета и сохраняла в два файла;
// tmp0.html, tmp1.html
// Корректно обработать ошибки, в том случае если сделали все read и write

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadFromInternet_lab {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.google.com");
        InputStream in = url.openStream();
        int b;
        while ((b = in.read()) != -1) {
            System.out.println((char)b);
        }
        in.close();
    }
}
