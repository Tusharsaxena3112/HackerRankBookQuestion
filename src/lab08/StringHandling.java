package lab08;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.next().trim();
        String lastName = input.next().trim();
        int pinCode = input.nextInt();
        UserID obj = new UserID(firstName, lastName, pinCode);
        System.out.println(obj);
    }
}
