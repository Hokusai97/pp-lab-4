import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Rafał Wiącek", 10000.0, 0, "Manager");
        employees[1] = new Worker("Adam Małysz", 5000.0, "Developer");
        employees[2] = new Employee("Michael Jordan", 8000.0);
        employees[3] = new Employee("Joe Biden", 6000.0);
        employees[4] = new Worker("Adam Gontier", 7000.0, "Designer");
        employees[5] = new Manager("John Cooper", 7000.0, 0, "Manager");
        employees[6] = new Worker("James Hetfield", 6000.0, "Tester");

        for (Employee emp : employees) {
            double newSalary = emp.getSalary() + 500.0;
            emp.setSalary(newSalary);
        }

        int subordinatesCount = 0;
        double managerSalary = 7500.0;
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                subordinatesCount++;
                emp.setSalary(managerSalary);
                ((Manager) emp).setNumberOfSubordinates(subordinatesCount);
            }
        }

        System.out.println("Updated Employee Information:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
