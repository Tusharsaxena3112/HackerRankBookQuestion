package multithreading;

public class Rabbit extends Thread {

    @Override
    public void run() {
        System.out.println("Rabbit has started its Race");
    }
}
