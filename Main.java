public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Rafał Wiącek", 10000.0);
        employees[1] = new Employee("Adam Małysz", 5000.0);
        employees[2] = new Employee("Michael Jordan", 8000.0);
        employees[3] = new Employee("Joe Biden", 6000.0);
        employees[4] = new Employee("Adam Gontier", 7000.0);

        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
