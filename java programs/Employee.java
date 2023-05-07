import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Department:");
        department = scanner.nextLine();
        System.out.println("Enter Salary:");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bonus:");
        bonus = scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: $" + bonus);
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Managers:");
        int n = scanner.nextInt();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            Manager manager = new Manager();
            manager.accept();
            managers[i] = manager;
        }

        Manager maxSalaryManager = findManagerWithMaxSalary(managers, n);

        System.out.println("\nManager with Maximum Total Salary:");
        maxSalaryManager.display();
    }

    public static Manager findManagerWithMaxSalary(Manager[] managers, int n) {
        Manager maxSalaryManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
                maxSalaryManager = managers[i];
            }
        }
        return maxSalaryManager;
    }
}
