import java.util.*;

public class Array {
    private int[] arr;
    private int size;

    public Array(int size) {
        this.size = size;
        this.arr = new int[size];
        Arrays.fill(this.arr, 0);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double average() {
        return sum() / (double) size;
    }

    public void swapMinMax() {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public void uniqueOccurrences() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println("Occurrence of unique elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }
    }

   



public static void main(String[] args) {
    Array arr = new Array(5);
    arr.input();
    arr.display();
    System.out.println("Sum: " + arr.sum());
    System.out.println("Average: " + arr.average());
    arr.swapMinMax();
    arr.display();
    arr.uniqueOccurrences();
}

}