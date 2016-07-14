package Lectrure17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListContains {
    public static void main(String[] args) {

        long t0, t1;
        List<String> list;

        list = new ArrayList<>();
        for(int k = 0; k < 10_000; k++) {
            list.add(""+k);
        }

        t0 = System.currentTimeMillis();
        testListContains(list);
        t1 = System.currentTimeMillis();
        System.out.println("ArrayList: " + (t1 - t0));

        list = new LinkedList<>();
        for(int k = 0; k < 10_000; k++) {
            list.add(""+k);
        }

        t0 = System.currentTimeMillis();
        testListContains(list);
        t1 = System.currentTimeMillis();
        System.out.println("ArrayList: " + (t1 - t0));

    }

        private static  void testListContains(List<String> list) {
            for (int k = 0; k < 100_000; k++) {
                list.contains("XYZ");


        }
    }
}
