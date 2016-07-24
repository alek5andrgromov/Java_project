package Golovach_courses.Lection1_5;

/**
 * Created by RockX5G on 26.03.2016.
 */
public class AppCounter {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        int counter = 0;
        while (true) {
            ref = new Object[] {ref, new byte[1_000]};
            System.out.println(counter++);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

