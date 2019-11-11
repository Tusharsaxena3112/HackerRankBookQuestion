package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImplementation {
    //Email format:
    //text@text.com
    //text-text@text.com
    //text-text-text.text@text.com
    //text@text-text.com
    //Test@text.com
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text");
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());

    }
}
