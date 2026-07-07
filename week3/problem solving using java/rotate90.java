import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (square matrix size): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose
        for (int i = 0; i < n; i++)
         {
            for (int j = i; j < n; j++) 
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++)
             {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        // Print rotated matrix
        System.out.println("Matrix rotated 90 degrees clockwise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
