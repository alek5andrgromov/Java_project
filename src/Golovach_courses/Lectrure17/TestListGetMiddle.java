package Golovach_courses.Lectrure17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TestListGetMiddle {
    public static void main(String[] args) {

        long t0, t1;
        List<String> list;

        list = new ArrayList<>();
        for(int k = 0; k < 100_000; k++) {
            list.add("A");
        }

        t0 = System.currentTimeMillis();
        testListGet(list);
        t1 = System.currentTimeMillis();
        System.out.println("ArrayList: " + (t1 - t0));

        list = new LinkedList<>();
        for(int k = 0; k < 100_000; k++) {
            list.add("A");
        }

        t0 = System.currentTimeMillis();
        testListGet(list);
        t1 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (t1 - t0));

    }

    private static  void testListGet(List<String> list) {
        int size = list.size();
        for (int k = 0; k < 100_000; k++) {
            String value = list.get(size/2);


        }
    }
}
