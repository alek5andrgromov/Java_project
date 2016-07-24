package Golovach_courses.Lection1_5.part1.part4;

/**
 * Created by RockX5G on 24.04.2016.
 */
public class Ok implements AutoCloseable {
    private String msg;
    public Ok(String msg) {
        this.msg = msg;
        System.err.println("new:" + msg);
    }
    public void close() {
        System.err.println("close:" + msg);
    }
}
