package stringHandling;

public class Question7 {
    private String inputString;

    public Question7(String inputString) {
        this.inputString = inputString;
        calculateWeight(inputString);
    }

    public void calculateWeight(String inputString) {
        int weight = 0;
        for (int i = 0; i < inputString.length() - 1; i++) {
            weight += (int) inputString.charAt(i);
        }
        System.out.println(weight);
    }
}
