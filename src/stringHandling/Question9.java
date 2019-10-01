package stringHandling;

public class Question9 {
    private String inputString;

    public Question9(String inputString) {
        this.inputString = inputString;
        System.out.println(printUpperWeight(inputString) - printLowerWeight(inputString));
    }

    public int printUpperWeight(String inputString) {
        int weight = 0;
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if ((int) inputString.charAt(i) >= 65 && (int) inputString.charAt(i) <= 91) {
                weight += (int) inputString.charAt(i);
            }
        }
        return weight;
    }

    public int printLowerWeight(String inputString) {
        int weight = 0;
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if ((int) inputString.charAt(i) >= 97 && (int) inputString.charAt(i) <= 122) {
                weight += (int) inputString.charAt(i);
            }
        }
        return weight;
    }
}
