import java.util.Arrays;
import java.util.Scanner;

public class quickSort {

    private static Object Arrays;

    public static void quickSort1(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort1(arr, low, pi - 1);
            quickSort1(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n;
            System.out.print("Enter the size of array: ");
            n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter array elements: ");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Array elements are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            // Quick Sort
            quickSort1(arr, 0, arr.length - 1);
            System.out.println("Quick Sort: " + Arrays.toString(arr));
        }
    }
}
