package practice;

import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        int[][] mat1 = new int[row][col];
        int[][] ans = new int[row][col];
        System.out.println("Enter First Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < col; k++) {
                    ans[i][j] += mat[i][k] * mat1[k][j];
                }
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
