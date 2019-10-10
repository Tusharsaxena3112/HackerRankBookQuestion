package multithreading;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Khargosh");
        rabbit.start();
        Turtle turtle = new Turtle("Kachua");
        turtle.start();
    }
}
