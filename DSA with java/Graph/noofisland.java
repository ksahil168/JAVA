package Javacollection.Graph;

public class noofisland {

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 0 },
                { 1, 2, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 } };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    dfs(arr, i, j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static int dfs(int[][] arr, int i, int j) {

        arr[i][j] = 0;

        if (i + 1 < arr.length && arr[i + 1][j] == 1) {
            dfs(arr, i + 1, j);
        }
        if (j + 1 < arr[0].length && arr[i][j + 1] == 1) {
            dfs(arr, i, j + 1);
        }
        if (i - 1 > 0 && arr[i - 1][j] == 1) {
            dfs(arr, i - 1, j);
        }
        if (j - 1 >= 0 && arr[i][j - 1] == 1) {
            dfs(arr, i, j - 1);
        }
    }
}
