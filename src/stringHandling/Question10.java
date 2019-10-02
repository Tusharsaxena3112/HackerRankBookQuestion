package stringHandling;

//WAP to print index of given character ch from inputString.
//
//     input:
//     char ch = 'a';
//     String inputString = "vaibhav";
//
//     output:
//     1

public class Question10 {
    private String inputString;
    private char a;

    public Question10(String inputString, char a) {
        this.inputString = inputString;
        this.a = a;
        System.out.println(inputString.indexOf(a));
    }


}
