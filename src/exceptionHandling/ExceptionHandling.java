package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Random input = new Random()
            // int random=input.nextInt();
            int[] array = new int[10];//Here it can generate exception .
            throw new IsInvalidArray("Invalid Array");


        } catch (IsInvalidArray e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }

}
