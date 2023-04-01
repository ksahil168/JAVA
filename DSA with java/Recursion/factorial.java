package Recursion;

public class factorial {

    public static double fact(double N) {

        if (N == 0) {
            return 1;
        }

        double nm1fact = fact(N - 1);
        return N * nm1fact;

    }

    public static void main(String[] args) {

        double N = 4;

        System.out.println(fact(N));

    }
}
