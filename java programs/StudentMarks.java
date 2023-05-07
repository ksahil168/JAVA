import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents, rollNo, marks, maxMarks = -1;
        String name, topStudent = "";

        System.out.print("Enter the number of students: ");
        numOfStudents = input.nextInt();

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            name = input.next();

            System.out.print("Enter the roll no of student " + i + ": ");
            rollNo = input.nextInt();

            System.out.print("Enter the marks of student " + i + ": ");
            marks = input.nextInt();

            if (marks > maxMarks) {
                maxMarks = marks;
                topStudent = name;
            }
        }

        System.out.println("The student who scored the highest marks is: " + topStudent);
    }
}
