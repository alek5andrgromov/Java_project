package Lecture12.part1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import static java.util.Collections.checkedList;

public class App01 {

    public static void main(String[] args) throws IOException {

    //    List list = new ArrayList();
        List list = checkedList(new ArrayList(), String.class);
        list.add("Hello");
        list.add(new Integer(0));

    }

}
