import java.util.Scanner;

interface IntOperations {
    boolean isPositive(int number);
    boolean isNegative(int number);
    boolean isEven(int number);
    boolean isOdd(int number);
    boolean isPrime(int number);
    boolean isPalindrome(int number);
    int factorial(int number);
    int sumOfDigits(int number);
}

class MyNumber implements IntOperations {
    private int num;

    public MyNumber() {
        this.num = 0;
    }

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isNegative(int number) {
        return number < 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }

    public int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        MyNumber myNumber = new MyNumber(number);

        System.out.println("\nMenu:");
        System.out.println("1. Check if the number is positive");
        System.out.println("2. Check if the number is negative");
        System.out.println("3. Check if the number is even");
        System.out.println("4. Check if the number is odd");
        System.out.println("5. Check if the number is prime");
        System.out.println("6. Check if the number is a palindrome");
        System.out.println("7. Calculate the factorial of the number");
        System.out.println("8. Calculate the sum of digits of the number");
        System.out.println("0. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();


switch (choice) {
                case 1:
                    System.out.println("Positive: " + myNumber.isPositive(number));
                    break;
                case 2:
                    System.out.println("Negative: " + myNumber.isNegative(number));
                    break;
                case 3:
                    System.out.println("Even: " + myNumber.isEven(number));
                    break;
                case 4:
                    System.out.println("Odd: " + myNumber.isOdd(number));
                    break;
                case 5:
                    System.out.println("Prime: " + myNumber.isPrime(number));
                    break;
                case 6:
                    System.out.println("Palindrome: " + myNumber.isPalindrome(number));
                    break;
                case 7:
                    System.out.println("Factorial: " + myNumber.factorial(number));
                    break;
                case 8:
                    System.out.println("Sum of digits: " + myNumber.sumOfDigits(number));
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}