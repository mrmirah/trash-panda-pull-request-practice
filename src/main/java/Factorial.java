public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 0;  // Should be 1

        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Factorial logic error
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
