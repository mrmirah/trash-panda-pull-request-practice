public class PrimeChecker {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {  // Should check till √num
            if (num % i == 0) {
                isPrime = true;  // Logical error
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is not prime.");  // Incorrect output
        } else {
            System.out.println(num + " is prime.");  // Incorrect output
        }
    }
}
