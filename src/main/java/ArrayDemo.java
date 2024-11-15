public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 0;

        while (index <= arr.length) {
            System.out.println("Element at index " + index + ": " + arr[index]);
            index += 2;
        }

        System.out.println("Extra access: " + arr[arr.length]);
    }
}
