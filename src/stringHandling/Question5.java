package stringHandling;

//WAP to replace all the occurrence of given subString from the inputString. --- (search library function for the task from the java docs by using the link [https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html]).

public class Question5 {
    private String inputString;
    private String subString;
    private String replaceString;

    public Question5(String inputString, String subString, String replaceString) {
        this.inputString = inputString;
        this.subString = subString;
        this.replaceString = replaceString;
        printReplace(inputString, subString, replaceString);
    }

    public void printReplace(String inputString, String subString, String replaceString) {
        inputString = inputString.replaceAll(subString, replaceString);
        System.out.println(inputString);

    }

}
