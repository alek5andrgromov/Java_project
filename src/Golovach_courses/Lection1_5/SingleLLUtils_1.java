package Golovach_courses.Lection1_5;

/**
 * Created by RockX5G on 20.03.2016.
 */
public class SingleLLUtils_1 {
    public static int length(Node tail) {
        return (tail == null) ? 0: 1 + length(tail.next);
    }

    public static int max(Node tail) {
        return (tail == null) ? 0 : Math.max(tail.value, max(tail.next));
    }

    public static int sum(Node tail) {
        return (tail == null) ? 0 : tail.value + sum(tail.next);
    }
}
