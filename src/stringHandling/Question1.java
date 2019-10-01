package stringHandling;

public class Question1 {
    private String givenString;

    public Question1(String givenString) {
        this.givenString = givenString;
        printString(givenString);
    }

    public void printString(String givenString) {
        System.out.printf("index: ");
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("chars: ");
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("%c ", givenString.charAt(i));
        }
    }
}
