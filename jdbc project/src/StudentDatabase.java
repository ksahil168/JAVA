import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();

            createTable(statement);

            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n***** Student Management System *****");
                System.out.println("1. Insert a new student record");
                System.out.println("2. Delete a student record");
                System.out.println("3. Search for a student record");
                System.out.println("4. View all student records");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertStudentRecord(statement, scanner);
                        break;
                    case 2:
                        deleteStudentRecord(statement, scanner);
                        break;
                    case 3:
                        searchStudentRecord(statement, scanner);
                        break;
                    case 4:
                        viewAllStudentRecords(statement);
                        break;
                    case 5:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 3);

            scanner.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Statement statement) throws SQLException {
        String query = "CREATE TABLE student (id NUMBER(3), name VARCHAR2(30), fees NUMBER(7,2))";
        statement.executeUpdate(query);
    }

    private static void insertStudentRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("\n***** Insert Student Record *****");

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student fees: ");
        double fees = scanner.nextDouble();

        String query = "INSERT INTO student VALUES (" + id + ", '" + name + "', " + fees + ")";
        statement.executeUpdate(query);

        System.out.println("Student record inserted successfully.");
    }

    private static void deleteStudentRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("\n***** Delete Student Record *****");

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM student WHERE id = " + id;
        int rowsAffected = statement.executeUpdate(query);

        if (rowsAffected > 0) {
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("No student record found with the specified ID.");
        }
    }

    private static void searchStudentRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("\n***** Search Student Record *****");

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        String query = "SELECT * FROM student WHERE id = " + id;
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            int studentId = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double fees = resultSet.getDouble("fees");

            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Fees: " + fees);
        } else {
            System.out.println("No student record found with the specified ID.");
        }

        resultSet.close();
    }

    private static void viewAllStudentRecords(Statement statement) throws SQLException {
        System.out.println("\n***** View All Student Records *****");

        String query = "SELECT * FROM student";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int studentId = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double fees = resultSet.getDouble("fees");

            System.out.println("ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Fees: " + fees);
            System.out.println("--------------------");
        }
}

/*
 * output
 * ***** Student Management System *****
 * 1. Insert a new student record
 * 2. Delete a student record
 * 3. Search for a student record
 * 4. View all student records
 * 5. Exit
 * Enter your choice: 1
 ***** 
 * Insert Student Record *****
 * Enter student ID: 101
 * Enter student name: John Doe
 * Enter student fees: 2500.0
 * Student record inserted successfully.
 ***** 
 * Student Management System *****
 * 1. Insert a new student record
 * 2. Delete a student record
 * 3. Search for a student record
 * 4. View all student records
 * 5. Exit
 * Enter your choice: 1
 ***** 
 * Insert Student Record *****
 * Enter student ID: 102
 * Enter student name: Jane Smith
 * Enter student fees: 3000.0
 * Student record inserted successfully.
 ***** 
 * Student Management System *****
 * 1. Insert a new student record
 * 2. Delete a student record
 * 3. Search for a student record
 * 4. View all student records
 * 5. Exit
 * Enter your choice: 4
 ***** 
 * View All Student Records *****
 * ID: 101
 * Name: John Doe
 * Fees: 2500.0
 * --------------------
 * ID: 102
 * Name: Jane Smith
 * Fees: 3000.0
 * --------------------
 ***** 
 * Student Management System *****
 * 1. Insert a new student record
 * 
 */
