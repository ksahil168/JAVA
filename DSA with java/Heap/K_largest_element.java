package Javacollection.Heap;

import java.util.PriorityQueue;

public class K_largest_element {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 4, 7, 2, 13, 3 };
        int k = 3;
        K_Largest_element(arr, k);
    }

    public static void K_Largest_element(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0;
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        while (i < arr.length) {
            if (arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            } else {
                // do nothing
            }
            i++;
        }
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }

}