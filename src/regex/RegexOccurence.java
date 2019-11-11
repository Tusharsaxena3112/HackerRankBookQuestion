package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOccurence {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String text = "This is the string text";
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

    }

}
