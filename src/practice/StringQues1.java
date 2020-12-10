package practice;

import java.util.Scanner;

public class StringQues1 {
    // Number of words in a sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        int count = 0;
        String str = sc.nextLine();
        str = str.trim();
        String[] arr = str.split(" ");
        for (String a :
                arr) {
            if (!a.equals("")) {
                count++;
                System.out.println("*" + a + "*");
            }
        }
        System.out.println(count);
    }
}
