package practice;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                System.out.println("No");
                c = 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Yes");
        }
    }
}
