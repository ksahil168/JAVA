import java.util.Scanner;

class Person {
    private String name;
    private String id;
    private int year_of_join;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter year of joining: ");
        this.year_of_join = sc.nextInt();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getYearOfJoin() {
        return this.year_of_join;
    }
}

class Teacher extends Person {
    private double basic;
    private double da;
    private double hra;
    private double epf;
    private String sub_taught;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject taught: ");
        this.sub_taught = sc.nextLine();
        System.out.print("Enter basic salary: ");
        this.basic = sc.nextDouble();
        System.out.print("Enter DA: ");
        this.da = sc.nextDouble();
        System.out.print("Enter HRA: ");
        this.hra = sc.nextDouble();
        System.out.print("Enter EPF: ");
        this.epf = sc.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("ID: " + super.getId());
        System.out.println("Subject taught: " + this.sub_taught);
        System.out.println("Joining year: " + super.getYearOfJoin());
        double gross_salary = this.basic + (this.basic * this.da / 100) + (this.basic * this.hra / 100);
        double net_salary = gross_salary - (gross_salary * this.epf / 100);
        System.out.println("Basic salary per month: " + this.basic);
        System.out.println("Total net salary received per year: " + net_salary * 12);
        System.out.println("Total EPF deposited per year: " + (this.basic * this.epf / 100) * 12);
    }
}

class Student extends Person {
    private double fees_per_sem;
    private String course;
    private int duration;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course offered: ");
        this.course = sc.nextLine();
        System.out.print("Enter duration (in years): ");
        this.duration = sc.nextInt();
        System.out.print("Enter fees per semester: ");
        this.fees_per_sem = sc.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("ID: " + super.getId());
        System.out.println("Course Offered: " + this.course);
        System.out.println("Joining year: " + super.getYearOfJoin());
        System.out.println("Total fees to be paid: " + this.fees_per_sem * 2 * this.duration);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teacher details:");
        Teacher t = new Teacher();
        t.input();
        System.out.println("\nTeacher's Annual Report:");
        t.display();

        System.out.println("\nEnter student details:");
        Student s = new Student();
        s.input();
        System.out.println("\nStudent's Details:");
        s.display();
    }
}