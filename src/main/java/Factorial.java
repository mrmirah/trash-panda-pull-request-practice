public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for (int j = 1; j <= num; j++) {
            factorial *= j;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
