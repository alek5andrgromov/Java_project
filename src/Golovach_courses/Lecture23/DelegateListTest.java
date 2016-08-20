package Golovach_courses.Lecture23;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by rockx5g on 16.08.16.
 */
class DelegateList extends ArrayList<Integer> {
    public  int delta() {
        return Collections.max(this) - Collections.min(this);
    }
}




public class DelegateListTest {

    public static void main(String[] args) {
        DelegateList list = new DelegateList();
        list.add(1);
        list.add(10);
        list.add(7);
        System.out.println(list.delta());
    }
    
    
    
    
}
