package practice;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int n = sc.nextInt();
        HashSet hs = new HashSet();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
