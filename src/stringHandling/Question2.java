package stringHandling;

public class Question2 {
    private String inputString;
    private int index;

    public Question2(String inputString, int index) {
        this.inputString = inputString;
        this.index = index;
        printSubstring(inputString, index);
    }


    public void printSubstring(String inputString, int index) {
        System.out.println(inputString.substring(index));
    }
}
