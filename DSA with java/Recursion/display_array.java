package Recursion;

public class display_array {

    public static void display_array2(int[] arr, int i) {

        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        display_array2(arr, i + 1);

    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50,80 };
        display_array2(arr, 0);

    }
}
