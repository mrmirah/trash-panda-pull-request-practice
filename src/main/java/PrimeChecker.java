public class PrimeChecker {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num <= 1) {
            System.out.println(num + " is not prime.");
        } else if (num == 2) {
            System.out.println(num + " is prime.");
        } else {
            if (isPrime) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
        }
    }
}
