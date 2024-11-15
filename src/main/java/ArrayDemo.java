public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 0;

        while (index < arr.length - 1) {//made < not <= and made it length -1
            System.out.println("Element at index " + index + ": " + arr[index]);
            index += 1;//made + 1 rather than + 2
        }

        System.out.println("Extra access: " + arr[arr.length - 1]);//made it length -1
    }
}
