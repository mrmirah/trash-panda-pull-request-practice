import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
