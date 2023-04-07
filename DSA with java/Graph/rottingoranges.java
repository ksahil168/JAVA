
package Graph;

import java.util.LinkedList;

public class rottingoranges {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 0 },
                { 1, 2, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 } };
        System.out.println(rottingoranges1(arr));

    }

    public static int rottingoranges1(int[][] arr) {
        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 2) {
                    int[] temp = { i, j, 0 };
                    queue.addLast(temp);
                }
            }
        }
        int ans = 0;
        while (queue.size() > 0) {
            int[] rem = queue.removeFirst();
            int r = rem[0];
            int c = rem[1];
            int time = rem[2];
            ans = time;

            if (r + 1 < arr.length && arr[r + 1][c] == 1) {
                int[] temp = { r + 1, c, time + 1 };
                queue.addLast(temp);
                arr[r + 1][c] = 2;
            }
            if (c - 1 >= 0 && arr[r][c - 1] == 1) {
                int[] temp = { r, c - 1, time + 1 };
                queue.addLast(temp);
                arr[r][c - 1] = 2;
            }
            if (r - 1 >= 0 && arr[r - 1][c] == 1) {
                int[] temp = { r - 1, c, time + 1 };
                queue.addLast(temp);
                arr[r - 1][c] = 2;
            }
            if (c + 1 < arr[0].length && arr[r][c + 1] == 1) {
                int[] temp = { r, c + 1, time + 1 };
                queue.addLast(temp);
                arr[r][c + 1] = 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;

    }

}
