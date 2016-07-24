package Golovach_courses.Lecture7.part1;

import java.util.Collections;
import java.util.List;

public class App00 {

    public static void main(String[] args) {
        f(Collections.emptyList());
    }
    public static void f(List<Integer> List) {
        System.err.println(0);
        try {
            System.err.println(1);
            if (true) throw new Error();
        } finally {
            System.err.println(2);
        }
        System.err.println(3);
    }
}
