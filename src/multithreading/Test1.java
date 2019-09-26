package multithreading;

public class Test1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread B");
    }
}
