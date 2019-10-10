package multithreading;

public class Rabbit extends Thread {
    public Rabbit(String name) {
        super(name);// Name of the Thread.
    }

    @Override
    public void run() {
        System.out.println(getName() + " has started its Race");
        try {                                      // Try catch as this can generate exception.
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " Reached Mountain");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " Has finished Race");
    }
}
