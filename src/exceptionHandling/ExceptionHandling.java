package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Random input = new Random()
            // int random=input.nextInt();
            int[] array = new int[-5];//Here it can generate exception .
            System.out.println("Array is successfully created");


        } catch (NegativeArraySizeException e) {
            System.out.println("array size cannot be negative");

        }
    }

}
