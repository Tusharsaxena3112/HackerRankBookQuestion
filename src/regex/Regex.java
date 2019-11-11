package regex;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
//        String str= "tus.saxena_cs18@gmail.com";
//        System.out.println(str.matches("\\w+.\\w+_cs18@gmail.com"));
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str1 = str.replaceAll("[aieou|AEIOU]", "*");
        System.out.println(str1);

    }
}
