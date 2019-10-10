package multithreading;

public class Turtle extends Thread {
    public Turtle(String name) { //Name of the Thread.
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " has started the race");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " has reached mountain.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
