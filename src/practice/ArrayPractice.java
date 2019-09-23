package practice;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int round = 0; round <= array.length - 1; round++) {
            int temp = 0;
            for (int j = 0; j < array.length - 1 - round; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
