package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOccurence {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String text = "This is the string text and is very helpful";
        Pattern pattern = Pattern.compile(" (is)+");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence: " + count + " from " + matcher.start() + " to " + matcher.end());
        }

        //Using group methods
        String string1 = "This is the string text and is very helpful";
        Pattern pattern1 = Pattern.compile(".* (is)+.*");
        Matcher matcher1 = pattern.matcher(string1);
        System.out.println(matcher1.matches());
        matcher1.reset();
        while (matcher1.find()) {
            System.out.println("Occurrence:" + matcher1.group(1));
        }
    }
}
