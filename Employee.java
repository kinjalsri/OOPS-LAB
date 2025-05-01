class Employee {
    String name;
    int empid;
    int salary;

    public Employee() {
        this.name = null;
        this.empid = 0;
        this.salary = 0;
    }

    public Employee(String name, int empid, int salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    int increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
        return this.salary;
    }
}

class manager extends Employee {
    String department;

    public manager(String name, int empid, int salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
}

class main {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("xyz", 123, 787);
        e2.increaseSalary(20.0);
        System.out.println(e2.salary);
        manager m1 = new manager("xyz", 123, 78748, "dept");
        m1.increaseSalary(85.0);
        System.out.println(m1.salary);
        System.out.println(m1.department);

    }
}
