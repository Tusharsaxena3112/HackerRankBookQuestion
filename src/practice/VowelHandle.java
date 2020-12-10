package practice;

import java.util.Scanner;

public class VowelHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = "";
        String s = sc.nextLine();
        char[] sa = s.toCharArray();
        for (char i :
                sa) {
            if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u') {
                p += i;
            }
        }
        System.out.println(p);
    }
}
