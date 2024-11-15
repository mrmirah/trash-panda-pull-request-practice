public class PrimeChecker {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {  
            if (num % i == 0) {
                isPrime = true;  
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is not prime.");  
            System.out.println(num + " is prime.");  
        }
    }
}
