package pl.sdacademy.designpatterns.Singleton;

public class Counter {
    private int value = 0;

    private static Counter counter = new Counter();

    public void addOne() {
        value += 1;
        System.out.println("val now" + value);
    }

    public void addThree() {
        value += 3;
        System.out.println("val now" + value);
    }

    public static Counter getInstance() {
        return counter;
    }

    private Counter() {
    }
}
