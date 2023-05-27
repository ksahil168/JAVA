import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class FileReadWriteExample {
    private static final String FILE_PATH = "student.txt";

    public static void main(String[] args) {
        // Writing records into the file
        writeRecords(new Student(1, "John Doe"));
        writeRecords(new Student(2, "Jane Smith"));
        writeRecords(new Student(3, "Alice Johnson"));

        // Reading all records from the file
        readAllRecords();

        // Searching a record from the file
        int rollNoToSearch = 1;
        searchRecord(rollNoToSearch);
    }

    private static void writeRecords(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(student.getRollNo() + "," + student.getName());
            writer.newLine();
            System.out.println("Record written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing the record: " + e.getMessage());
        }
    }

    private static void readAllRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("All Records:");
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(",");
                int rollNo = Integer.parseInt(record[0]);
                String name = record[1];
                System.out.println("Roll No: " + rollNo + ", Name: " + name);
            }
        } catch (IOException e) {
            System.out.println("Error reading records from the file: " + e.getMessage());
        }
    }

    private static void searchRecord(int rollNoToSearch) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean found = false;
            System.out.println("Searching Record for Roll No " + rollNoToSearch + ":");
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(",");
                int rollNo = Integer.parseInt(record[0]);
                String name = record[0];
                if (rollNo == rollNoToSearch) {
                    System.out.println("Record found! Roll No: " + rollNo + ", Name: " + name);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Record not found for Roll No " + rollNoToSearch);
            }
        } catch (IOException e) {
            System.out.println("Error searching record: " + e.getMessage());
        }
    }
}