package Golovach_courses.Lection1_5;

public class ParserTest {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser_q.eval("123"));
        System.out.println(">> 2*3 = " + Parser_q.eval("2*3"));
        System.out.println(">> 2*(1+3) = " + Parser_q.eval("2*(1+3"));
        System.out.println(">> 1+(5-2*(13/6)) = " + Parser_q.eval("1+(5-2*(13/6))"));
    }
}
