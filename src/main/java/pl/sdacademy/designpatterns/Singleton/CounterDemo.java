package pl.sdacademy.designpatterns.Singleton;

public class CounterDemo {
    public static void main(String[] args) {

        final Counter counterA = Counter.getInstance();
        counterA.addOne();
        counterA.addOne();
        counterA.addThree();

    }
}
