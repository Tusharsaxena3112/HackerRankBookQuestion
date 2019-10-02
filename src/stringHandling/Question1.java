package stringHandling;

//WAP to print any given inputString in following format.
//
//Output
//
//index:  0    1   2   3   4
//chars:  H    e   l   l   o
//
//Every character is seprated by tab, use "\t" for inserting tab.

public class Question1 {
    private String givenString;

    public Question1(String givenString) {
        this.givenString = givenString;
        printString(givenString);
    }

    public void printString(String givenString) {
        System.out.printf("index:\t");
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
        System.out.printf("chars:\t");
        for (int i = 0; i <= givenString.length() - 1; i++) {
            System.out.printf("%c\t", givenString.charAt(i));
        }
    }
}
