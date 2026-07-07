/*
public class transpose {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9} };

        // Transpose in-place
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        // In-place transpose only works for square matrices
        if (r != c) {
            System.out.println("In-place transpose with temp works only for square matrices!");
            return;
        }

        int[][] arr = new int[r][c];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose in-place using temp
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {  // start from j=i to avoid double swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
