package stringHandling;

//WAP to print all the index in newline of given character ch form the inputString.
//
// input:
// char ch = 'a';
// String inputString = "vaibhav";
//
// output:
// 1
// 5

public class Question11 {
    private String inputString;
    private char a;

    public Question11(String inputString, char a) {
        this.inputString = inputString;
        this.a = a;
        indexFind(inputString, a);
    }

    public void indexFind(String inputString, char a) {
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (inputString.charAt(i) == a) {
                System.out.println(i);
            }
        }
    }

}
