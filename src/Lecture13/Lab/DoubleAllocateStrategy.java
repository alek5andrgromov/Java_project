package Lecture13.Lab;


public class DoubleAllocateStrategy implements AllocateStrategy {
    public int nextAfter(int now) {
        return now * 2;
    }
}
