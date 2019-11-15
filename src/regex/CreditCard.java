package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Credit card no.:");
        String number = scanner.nextLine();
        Pattern pattern = Pattern.compile("^([0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4})$|^\\d{16}$");
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.matches());
    }
}
