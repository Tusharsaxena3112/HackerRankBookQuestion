package stringHandling;

public class Question1 {
    private String givenString;

    public Question1(String givenString) {
        this.givenString = givenString;
        printString(givenString);
    }

    public void printString(String givenString) {
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("index:%d", i);
        }
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("Chars:%c", givenString.charAt(i));
        }
    }
}
