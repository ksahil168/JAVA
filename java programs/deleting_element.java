public class deleting_element {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 5, 2, 21 };
        int k = 2, n = 5;
        int j = 0;
        while (j < n) {
            if (arr[j] == k) {
                break;
            }
            j = j + 1;

        }
        System.out.println("Element found at position :" + (j + 1));

    }
}
