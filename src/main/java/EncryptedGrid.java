import java.util.Scanner;

public class EncryptedGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] grid = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = i * j;
            }
        }


        System.out.println("The Encrypted Grid:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter the row (1-5) and column (1-5) to sum, separated by a space:");
        int row = sc.nextInt();
        int col = sc.nextInt();


        if (row < 0 || col < 0 || row >= 5 || col >= 5) {
            System.out.println("Invalid row or column!");
            return;
        }


        int rowSum = 0;
        for (int i = 0; i < 5; i++) {
            rowSum += grid[row][i];
        }

        int colSum = 0;
        for (int i = 0; i < 5; i++) {
            colSum += grid[i][col];
        }

       
        int totalSum = rowSum + colSum;

        System.out.println("The encrypted sum is: " + totalSum);
    }
}
