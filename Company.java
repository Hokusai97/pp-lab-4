import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Rafał Wiącek", 10000.0, 0, "Manager");
        employees[1] = new Worker("Adam Małysz", 5000.0, "Developer");
        employees[2] = new Employee("Michael Jordan", 8000.0);
        employees[3] = new Employee("Joe Biden", 6000.0);
        employees[4] = new Worker("Adam Gontier", 7000.0, "Developer");

        int numberOfNonManagers = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                numberOfNonManagers++;
            }
        }

        ((Manager)employees[0]).setNumberOfSubordinates(numberOfNonManagers);

        employees[0].setSalary(7500.0);

        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println("Employee " + emp.getFullName() + ": " + emp);
        }
    }
}
