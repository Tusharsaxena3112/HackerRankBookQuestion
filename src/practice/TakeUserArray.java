package practice;

import java.util.Scanner;

public class TakeUserArray {
    public int[] user(int n) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[n];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}
