package Golovach_courses.Lecture7.part2;


public class App02 {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError();
            } catch (Error e) {
            throw new NullPointerException();
            } catch (Exception e) {
            throw new NullPointerException();
            } finally {
            System.err.println(0);

        }

    }
}
