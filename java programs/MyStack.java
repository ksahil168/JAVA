import java.util.Scanner;

public interface StackOperations {
    void push(int element);

    int pop();

    int peak();
}

public class MyStack implements StackOperations {
    private int[] array;
    private int top;

    public MyStack(int size) {
        array = new int[size];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top == array.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            array[top] = element;
            System.out.println("Pushed " + element + " to stack");
        }
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int element = array[top];
            top--;
            System.out.println("Popped " + element + " from stack");
            return element;
        }
    }

    @Override
    public int peak() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int element = array[top];
            System.out.println("Top element of stack is " + element);
            return element;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();
        MyStack stack = new MyStack(size);
        int choice;
        do {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peak();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
