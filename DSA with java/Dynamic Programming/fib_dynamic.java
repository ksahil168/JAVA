//recursive method , if n is a big number lets take 50, it takes more time to print the result
//Bottom Up Approach

public class fib_dynamic {

    private static int i;

    static int fib_rec_nodynamic(int n) {
        if (n <= 1) {
            return n;
        }
        return fib_rec_nodynamic(n - 1) + fib_rec_nodynamic(n - 2);
    }

    public static long fib_dynamicp(int n) {
        if (n < 2) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println("Dynamic Programming Approach");
        System.out.println("-----------------------------");
        for (int i = 0; i <= 5; ++i) {
            System.out.println(i + ":" + fib_dynamicp(i));
        }
        System.out.println("Recursive or Non Dynamic Programming Approach");
        System.out.println("-----------------------------");
        for (int i = 0; i <= 5; ++i) {

            System.out.println(i + ":" + fib_rec_nodynamic(i));
        }

    }

}
