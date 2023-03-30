package Recursion;

public class print_increasingNumber {

    public static void print_increasingNumberfrom(int N) {

        if (N == 0) {
            return;
        }

        print_increasingNumberfrom(N - 1);
        System.out.println(N);

    }

    public static void main(String[] args) {

        print_increasingNumberfrom(10);

    }
}
