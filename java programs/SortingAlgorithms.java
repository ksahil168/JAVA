import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap arr[i] and arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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

    // Merge Sort
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] left1 = new int[n1];
        int[] right1 = new int[n2];
        for (int i = 0; i < n1; i++)
            left1[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            right1[j] = arr[middle + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (left1[i] <= right1[j]) {
                arr[k] = left1[i];
                i++;
            } else {
                arr[k] = right1[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right1[j];
            j++;
            k++;
        }
    }

    // Main method for testing
    public static void main5(String[] args) {
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

            // Bubble Sort
            bubbleSort(arr);
            System.out.println("\nBubble Sort: " + Arrays.toString(arr));

            // Selection Sort
            selectionSort(arr);
            System.out.println("Selection Sort: " + Arrays.toString(arr));

            // Insertion Sort
            insertionSort(arr);
            System.out.println("Insertion Sort: " + Arrays.toString(arr));

            // Quick Sort
            quickSort(arr, 0, arr.length - 1);
            System.out.println("Quick Sort: " + Arrays.toString(arr));

            // Merge Sort
            mergeSort(arr, 0, arr.length - 1);
            System.out.println("Merge Sort: " + Arrays.toString(arr));
        }
    }
}