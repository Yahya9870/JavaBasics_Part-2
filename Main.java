// Superclass or Parent class or Base class: Employee
class Employee {
    // Data members
    String name;
    int age;
    String department;
    double salary;

    // Constructor
        public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Methods
    public void work() {
        System.out.println(name + " is working");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break");
    }

    public void getPaid() {
        System.out.println(name + " is getting paid $" + salary);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass or Derived class or child class: Manager
class Manager extends Employee {
    // Additional data members
    private int teamSize;

    // Constructor
    public Manager(String name, int age, String department, double salary, int teamSize) {
        super(name, age, department, salary);
        this.teamSize = teamSize;
    }

    // Overridden methods
    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize);
    }

    @Override
    public void getPaid() {
        System.out.println(name + " is getting paid $" + salary + " plus bonuses");
    }

    // Additional methods
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    // Additional data members
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int age, String department, double salary, String programmingLanguage) {
        super(name, age, department, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden methods
    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    @Override
    public void getPaid() {
        System.out.println(name + " is getting paid $" + salary + " plus stock options");
    }

    // Additional methods
    public void debugCode() {
        System.out.println(name + " is debugging code");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Employee object
        System.out.println("Parent class Employee info: ");
        Employee emp = new Employee("Sushil", 30, "IT", 500000);
        emp.work();
        emp.takeBreak();
        emp.getPaid();
        emp.displayInfo();

        System.out.println(); // Line changer

        // Create Manager object
        Manager mgr = new Manager("Alex", 40, "HR", 90000, 10);
        System.out.println("Child class Manager info: ");
        mgr.work();
        mgr.takeBreak();
        mgr.getPaid();
        mgr.conductMeeting();
        mgr.displayInfo();

        System.out.println();
//
//        // Create Developer object
        Developer dev = new Developer("Alice Johnson", 25, "Engineering", 80000, "Core Java");
        System.out.println("Child class Developer info:      ");
        dev.work();
        dev.takeBreak();
        dev.getPaid();
        dev.debugCode();
        dev.displayInfo();
    }
}
