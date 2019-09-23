package Lab07;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine().trim();
        String[] arr = new String[Integer.parseInt(number)];
        for (int i = 0; i < Integer.parseInt(number); i++) {
            String name = input.next();
            String company = input.next();
            String age = input.next();
            User user = new User(name, company, age);
            //arr[i] = user.toString();
            arr[i] = user.createPassword();
        }
        for (int i = 0; i < Integer.parseInt(number); i++) {
            System.out.println(arr[i]);
        }


    }
}
