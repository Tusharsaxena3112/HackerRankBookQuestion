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
    }
}
