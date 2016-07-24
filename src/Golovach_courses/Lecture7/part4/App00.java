package Golovach_courses.Lecture7.part4;

public class App00 {
    public static void main(String[] args) throws  Exception {
        try {
            throw new Error();
        } catch (Error e) {
            throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println(e);
            System.out.println(e.getCause());
            System.out.println(e.getCause().getCause());
           // throw new Exception(e);

        }
    }
}


