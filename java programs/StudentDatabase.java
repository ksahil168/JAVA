import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDatabase {
    static final String DB_URL = "jdbc:mysql://localhost/sahil";
   static final String USER = "root";
    static final String PASS = "system";
    
    public static void main(String[] args) {
        try {
            
           
            
            // Step 2: Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Step 3: Create a statement
            Statement stmt = conn.createStatement();
            
            // Step 4: Create the student table if it doesn't exist
            createStudentTable(stmt);
            
            // Step 5: Handle user input
            boolean exit = false;
            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert a student record");
                System.out.println("2. Delete a student record");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = Integer.parseInt(System.console().readLine());
                
                switch (choice) {
                    case 1:
                        insertStudentRecord(stmt);
                        break;
                    case 2:
                        deleteStudentRecord(stmt);
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            
            // Step 6: Close the statement and connection
            stmt.close();
            conn.close();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static void createStudentTable(Statement stmt) throws SQLException {
        String sql = "CREATE TABLE registration2 " +
                        "(id NUMBER (3), " +
                        " name varchar2(30), " + 
                          
                             " fees NUMBER(7,2))"; 
        stmt.executeUpdate(sql);
        System.out.println("Student table created successfully.");
    }
    
    private static void insertStudentRecord(Statement stmt) throws SQLException {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(System.console().readLine());
        
        System.out.print("Enter student name: ");
        String name = System.console().readLine();
        
        System.out.print("Enter student fees: ");
        double fees = Double.parseDouble(System.console().readLine());
        
        String sql = "INSERT INTO student VALUES (" + id + ", '" + name + "', " + fees + ")";
        stmt.executeUpdate(sql);
        
        System.out.println("Student record inserted successfully.");
    }
    
    private static void deleteStudentRecord(Statement stmt) throws SQLException {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(System.console().readLine());
        
        String sql = "DELETE FROM student WHERE id = " + id;
        int rowsAffected = stmt.executeUpdate(sql);
        
        if (rowsAffected > 0) {
            System.out.println("Student record deleted successfully.");
        } else {
            System.out.println("No matching student record found.");
        }
    }
}
