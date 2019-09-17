package hackerRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n != 0) {
            input.nextLine().trim();
        }
        Books a[] = new Books[n];
        for (int i = 0; i <= n - 1; i++) {
            String name = input.nextLine();
            String author = input.nextLine();
            String number = input.nextLine();
            a[i] = new Books(name, author, number);
        }
        if (a.length != 0) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        } else {
            System.out.println("N/A");
        }
    }

}