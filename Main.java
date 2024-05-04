public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Rafał Wiącek", 5000.0);

        System.out.println("Initial Employee Details:");
        System.out.println(employee);

        employee.setSalary(10000.0);

        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
    }
}
