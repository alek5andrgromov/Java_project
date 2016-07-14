package Lectrure17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TestListInsertFirst {
    public static void main(String[] args) {

        long t0, t1;

        t0 = System.currentTimeMillis();
        testListInsert(new ArrayList<String>());
        t1 = System.currentTimeMillis();
        System.out.println("ArrayList: " + (t1 - t0));

        t0 = System.currentTimeMillis();
        testListInsert(new LinkedList<String>());
        t1 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (t1 - t0));

    }

    private static  void testListInsert(List<String> list) {

        for (int k = 0; k < 100_000; k++) {
          list.add(0, "A");
        }
    }
}
