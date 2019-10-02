package stringHandling;

//Modify the above program so that:
//
//first occurred vowel will be replaced by *.
//Second occurred vowel will be replaced by ^.
//Third occurred vowel will be replaced by !.
//repeat the above process for all occurred vowels.

public class Question4 {
    private String inputString;

    public Question4(String inputString) {
        this.inputString = inputString;
        replaceVowel(inputString);
    }

    public void replaceVowel(String inputString) {
        String s1 = "";
        String s2 = inputString.toLowerCase();
        int vowelCounter = 0;
        for (int i = 0; i <= s2.length() - 1; i++) {
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                vowelCounter += 1;
                if (vowelCounter % 3 == 1) {
                    s1 += "*";
                } else if (vowelCounter % 3 == 2) {
                    s1 += "^";
                } else {
                    s1 += "!";
                }
            } else {
                s1 += inputString.charAt(i);
            }
        }
        System.out.println(s1);
    }

}
