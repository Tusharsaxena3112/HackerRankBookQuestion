package stringHandling;

//

public class Question4 {
    private String inputString;

    public Question4(String inputString) {
        this.inputString = inputString;
    }

    public void replaceVowel(String inputString) {
        int c = 0;
        inputString = inputString.toLowerCase();
        for (int i = 0; i <= inputString.length() - 1; i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u' && c == 0) {
                inputString = inputString.replace(inputString.charAt(i), '*');
                c += 1;
            }
        }
    }
}
