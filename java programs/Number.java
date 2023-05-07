import java.util.Arrays;

class Number {
    protected int[] numbers;

    public Number(int n) {
        numbers = new int[n];
        // Input n numbers into the array
        // Assuming you have a way to input the numbers, such as through user input or a
        // predefined array
    }

    public void displayNumbers() {
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

class OddNum extends Number {
    private int[] oddNumbers;

    public OddNum(Number number) {
        super(number.numbers.length);
        int count = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                count++;
            }
        }
        oddNumbers = new int[count];
        int index = 0;
        for (int num : number.numbers) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
    }

    public void displayOddNumbers() {
        System.out.println("Odd Numbers:");
        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }
        System.out.println();
    }
}

class PrimeNum extends OddNum {
    private int[] primeNumbers;

    public PrimeNum(OddNum oddNum) {
        super(oddNum);
        int count = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        primeNumbers = new int[count];
        int index = 0;
        for (int num : oddNum.oddNumbers) {
            if (isPrime(num)) {
                primeNumbers[index++] = num;
            }
        }
    }

    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers:");
        for (int primeNumber : primeNumbers) {
            System.out.print(primeNumber + " ");
        }
        System.out.println();
    }

    private boolean isPrime(int number) {
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

    public static void main(String[] args) {
        Number number = new Number(10);
        number.displayNumbers();

        OddNum oddNum = new OddNum(number);
        oddNum.displayOddNumbers();

        PrimeNum primeNum = new PrimeNum(oddNum);
        primeNum.displayPrimeNumbers();
    }
}