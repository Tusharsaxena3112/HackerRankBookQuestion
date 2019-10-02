package stringHandling;

//WAP to print UpperWeight of given inputString. UpperWeight can be find by adding all the upper case characters of the inputString.

public class Question8 {
    private String inputString;

    public Question8(String inputString) {
        this.inputString = inputString;
        printUpperWeight(inputString);
    }

    public void printUpperWeight(String inputString) {
        int weight = 0;
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if ((int) inputString.charAt(i) >= 65 && (int) inputString.charAt(i) <= 91) {
                weight += (int) inputString.charAt(i);
            }
        }

        System.out.println(weight);
    }
}
