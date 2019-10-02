package stringHandling;
//WAP to print the totalWeight of given inputString.
//
//  totalWeight can be calculate by adding *ASCII* value of all the characters.
//          for example:
//          inputString = "Abc";
//          totalWeight = 65 + 98 + 99;
//
//          where ASCII values:
//              A --> 65
//              b --> 98
//              c --> 99

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
