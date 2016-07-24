package Golovach_courses.Lection1_5;

import java.security.MessageDigest;


/**
 * Created by rockx5g on 18.06.16.
 */
public class Quiz {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for(byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
