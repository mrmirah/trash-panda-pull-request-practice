import java.util.Scanner;

public class MatrixManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for matrix A (e.g., 2 3): ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        System.out.println("Enter the number of rows and columns for matrix B (e.g., 3 2): ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i <= rowsB; i++) {
            for (int j = 0; j <= colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplying matrices A and B...");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
