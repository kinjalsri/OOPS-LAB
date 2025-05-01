package lab9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class que2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 60000));
        employees.add(new Employee("Charlie", 103, 55000));

        // Update Bob's salary
        for (Employee e : employees) {
            if (e.id == 102) {
                e.salary = 65000;
            }
        }

        // Remove Charlie by ID
        employees.removeIf(e -> e.id == 103);

        // Print remaining employees
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}