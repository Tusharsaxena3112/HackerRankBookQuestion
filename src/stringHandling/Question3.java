package stringHandling;

//WAP to accept inputString from user and replace all the vowels by *, by using String replace(char oldChar, char newChar).
//
//  String s1 = "vaibhav";
//  s1 = s1.replace('a','*');
//  System.out.println(s1);
//
//  output:
//  v*ibh*v

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
