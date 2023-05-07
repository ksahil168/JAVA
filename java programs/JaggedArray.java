import java.util.Scanner;

public class JaggedArray {

    private int[][] marks;
    private String[] names = { "Child1", "Child2", "Child3", "Child4", "Child5" };

    // Constructor to allocate memory for the array
    public JaggedArray(int[] subjects) {
        int numChildren = 5;
        marks = new int[numChildren][];
        for (int i = 0; i < numChildren; i++) {
            marks[i] = new int[subjects[i]];
        }
    }

    // Input marks in different subjects for different children
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + names[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    // Show the marks row-wise with child name at the beginning
    public void showMarks() {
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Show the total marks scored by each child
    public void showTotalMarks() {
        System.out.println("Total Marks:");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println(names[i] + ": " + total);
        }
    }

    // Count the marks which are more than 80 separately for each child
    public void countHighMarks() {
        System.out.println("Marks > 80:");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > 80) {
                    count++;
                }
            }
            System.out.println(names[i] + ": " + count);
        }
    }

    // method to alert marks less than 30
    public void alertMarks() {
        System.out.println("Marks less than 30:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 30) {
                    System.out.println("Child" + (i + 1) + " subject" + (j + 1) + ": " + marks[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] subjects = { 3, 5, 2, 6, 4 };
        JaggedArray jaggedArray = new JaggedArray(subjects);
        jaggedArray.inputMarks();
        jaggedArray.showMarks();
        jaggedArray.showTotalMarks();
        jaggedArray.countHighMarks();
        jaggedArray.alertMarks();
    }
}