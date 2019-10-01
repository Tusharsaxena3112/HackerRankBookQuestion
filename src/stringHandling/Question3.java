package stringHandling;

public class Question3 {
    private String inputString;

    public Question3(String inputString) {
        this.inputString = inputString;
        printString(inputString);
    }

    public void printString(String inputString) {
        inputString = inputString.toLowerCase();
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
                inputString = inputString.replace(inputString.charAt(i), '*');
            }
        }
        System.out.println(inputString.toUpperCase());
    }
}
