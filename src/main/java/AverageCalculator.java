import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers separated by spaces: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) continue;
            sum += numbers[i];
        }

        double average = (int) (sum / n);
        System.out.println("The average is: " + average);
    }
}
