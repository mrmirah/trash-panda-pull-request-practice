public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print(a + " " + b); 

        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c; // adjusted second pointer
            System.out.print(" " + c); // print sum
        }
    }
}
