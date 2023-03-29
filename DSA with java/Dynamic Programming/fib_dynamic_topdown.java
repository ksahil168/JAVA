//top down Approach

class fib_dynamic_topdown {

    public static int fib_topdown(int N, int[] dp) {
        if (N == 0 || N == 1) {
            return N;
        }

        if (dp[N] != 0) {
            return dp[N];
        }

        int nm1 = fib_topdown(N - 1, dp);
        int nm2 = fib_topdown(N - 2, dp);

        dp[N] = nm1 + nm2;
        return nm1 + nm2;
    }

    public static void main(String[] args) {
        int N = 10;
        int[] dp = new int[N + 1];
        System.out.println(fib_topdown(N, dp));
    }
}