package Lecture8.part1;


public class App00 {
    public static void main(String[] args) throws Exception {
      Exception ref = new RuntimeException();
        try {
            throw ref;
        } catch (RuntimeException e) {

        }
    }


}

class A extends Exception {}
class B extends A {}