package multithreading;

public class IntroToThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        Thread t2 = new Thread(new Test1());
        t1.start();
        t2.start();
    }
}
