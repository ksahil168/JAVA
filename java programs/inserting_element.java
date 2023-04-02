public class inserting_element {
    public static void main(String[] args) {
        int[] la = new int[] { 1, 3, 5, 7, 8 };
        int item = 10, k = 2, n = 4;
        int i = 0, j = n - 1;

        n = n + 1;
        while (j >= k) {
            la[j + 1] = la[j];
            j = j - 1;
        }
        la[k] = item;
        System.out.println("The array elements after insertion :");

        for (i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + la[i] + " ");
        }
    }
}